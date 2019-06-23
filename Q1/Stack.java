/*Stack.java
Noël Khalaf, Tony Kim
300079144, 300087407
ITI1121
*/
/*Generic interface Stack contains abstracts methods to be implemented by ArrayStack and LinkedStack*/
public interface Stack<T>{
	
	/*Returns true if this ArrayStack is empty*/
	public abstract boolean isEmpty();
	
	/*Returns true if this ArrayStack is full*/
	public abstract boolean isFull();
	
	/*Returns the top element of this ArrayStack without removing it*/
	public abstract T peek();
	
	/*Removes and returns the top element of this stack*/
	public abstract T pop();
	
	/*Adds a new value to the top of the stack*/
	public abstract void push(T element);
	
	/*Clears the stack of all elements*/
	public abstract void clear();
	
	/*Returns the size of the stack*/
	public abstract int size();
	
	/*Reverses the order of the elements in the stack*/
	public abstract void reverse();
	
	/*Returns a String representation of the stack and its contents*/
	public abstract String toString();
	
	/*Calls the method toString to print the contents of the stack*/
	public abstract void display();
}