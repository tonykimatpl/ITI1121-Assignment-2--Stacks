/*LinkedStack.java
Noël Khalaf, Tony Kim
300079144, 300087407
ITI1121
*/
/*Creates a stack using a list of class objects*/
public class LinkedStack<T> implements Stack<T>{
	
	//Instance variables
	private Elem<T> top;
	private int size;
	
	/*Creates a reference variable to hold a new value and hold a given value*/
	private static class Elem<E>{
		
		//Instance variables
		private E value;
		private Elem<E> next;
		
		//Elem Constructor
		private Elem(E value, Elem<E> next){
			this.value = value;
			this.next = next;
		}
	}
	
	//Linked Stack Constructor
	public LinkedStack(){
		this.top = null;
		this.size = 0;
	}
	
	//Returns true if stack is empty
	public boolean isEmpty(){
		return top == null;
	}
	
	//Always returns false since LinkedStack does not have a maximum capacity
	public boolean isFull(){
		return false;
	}
	
	//Returns top value of the stack
	public T peek(){
		if(!isEmpty()){
			return top.value;
		}
		else{
			return null;
		}
	}
	
	//Returns top value of the stack and removes it from the stack
	public T pop(){
		if(!isEmpty()){
			T temp = top.value;
			top = top.next;
			size--;
			return temp;
		}
		else{
			return null;
		}
	}
	
	//Adds a new value to the top of the stack
	public void push(T value){
		top = new Elem<T>(value, top);
		size++;
	}
	
	//Clears the stack of all values
	public void clear(){
		top = null;
	}
	
	//Returns the size of the stack
	public int size(){
		return size;
	}
	
	//Reverses the order of the elements of the stack
	public void reverse(){
		LinkedStack<T> temp = new LinkedStack<T>();
		while(!isEmpty()){
			temp.push(this.pop());
		}
		this.size = temp.size();
		this.top = temp.top;
	}
	
	//Returns a String representation of the stack and its contents
	public String toString(){
		String s = "[";
		LinkedStack<T> temp = new LinkedStack<T>();
		temp.top = this.top;
		while(!temp.isEmpty()){
			s = s + temp.pop()+",";
		}
		s = s+"]";
		return s;
	}
	
	//Calls the method toString to print the contents of the stack
	public void display(){
		System.out.println(toString());
	}
}