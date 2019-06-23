/*ArrayStack.java
Noël Khalaf, Tony Kim
300079144, 300087407
ITI1121
*/
/*Creates a stack using an array of generic elements*/
public class ArrayStack<T> implements Stack<T> {

    // Instance variables
    private T[] elems;
    private int top;
	private int size;
	private int cap;
	
    // Constructor
    public ArrayStack(int capacity) {
        elems = (T[]) new Object[capacity];
        top = -1;
		size = 0;
		cap = capacity;
    }

    //Returns true if this ArrayStack is empty
    public boolean isEmpty() {
        return top == -1;
    }

	//Returns true if this ArrayStack is full
	public boolean isFull(){
		return size == cap;
	}
	
    //Returns the top element of this ArrayStack without removing it
    public T peek() {
        if(!isEmpty()){
			return elems[top];
		}
		else{
			return null;
		}
    }

    //Removes and returns the top element of this stack
    public T pop() {
        if(!isEmpty()){
			T saved = elems[top];
			elems[top] = null;
			top--;
			size--;
			return saved;
		}
		else{
			return null;
		}
	}

    //Puts the element onto the top of this stack
    public void push(T element) {
       if(element!=null && top<elems.length ){
         elems[++top] = element; 
		 size++;
       }
        
    }
	
	//Clears the stack of all elements
	public void clear(){
		//empties each element until stack is empty
		while(!isEmpty()){
			elems[top--] = null;
		}
	}
	
	//Returns the size of the stack
	public int size(){
		return size;
	}
	
	//Reverses the order of the elements in the stack
	public void reverse(){
		ArrayStack<T> temp = new ArrayStack<T>(cap);
		for(int i=0; i<size(); i++){
			temp.elems[top-i] = elems[i];
		}
		this.elems = temp.elems;
	}
	
	//Returns a String representation of the stack and its contents
	public String toString(){
		String s="[";
		for(int i=0; i<size; i++){
			if(i == size-1){
				s = s+elems[i];
			}
			else{
				s = s+elems[i]+",";
			}
		}
		s = s+"]";
		return s;
	}
	
	//Calls the method toString to print the contents of the stack
	public void display(){
		System.out.println(toString());
	}
}
