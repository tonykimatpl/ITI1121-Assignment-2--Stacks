/*QuestionOne.java
Noël Khalaf, Tony Kim
300079144, 300087407
ITI1121
*/
/*Class QuestionOne tests the ArrayStack and LinkedStack classes*/
public class QuestionOne{
	/*Main method exectues and calls methods from ArrayStack and LinkedStack*/
	public static void main(String[] args)
	{
		Stack<Integer> s = new ArrayStack<Integer>(20);		//Creates ArrayStack instance 
		Stack<Integer> st = new LinkedStack<Integer>();		//Creates LinkedStack instance
		
		for(int i=1; i<21; i++){
			s.push(new Integer(i));		//Pushes integers 1 to 20 into stack s
		}
		
		for(int i=20; i>0; i--){
			st.push(new Integer(i));	//Pushes integers 20 to 1 into stack st
		}
		
		/*Displays both stacks*/
		s.display();
		st.display();
		
		/*Reverses the order of both stacks*/
		s.reverse();
		st.reverse();
		
		/*Displays both stacks*/
		s.display();
		st.display();
		
		/*Returns the top element of both stacks*/
		s.peek();
		st.peek();
		
		/*Returns and removes the top element of both stacks*/
		s.pop();
		st.pop();
		
		/*Returns and removes the top element of both stacks*/
		s.pop();
		st.pop();
		
		/*Reverses the order of both stacks*/
		s.reverse();
		st.reverse();
		
		/*Returns true if stack is full, false if not*/
		s.isFull();
		st.isFull();
		
		/*Returns true if stack is empty, false if not*/
		s.isEmpty();
		st.isEmpty();
		
		/*Displays both stacks*/
		s.display();
		st.display();
		
		/*Removes all elements from both stacks*/
		s.clear();
		st.clear();
		
		/*Displays both stacks*/
		s.display();
		st.display();
		
		/*Returns true if stack is empty, false if not*/
		s.isEmpty();
		st.isEmpty();
	}
}