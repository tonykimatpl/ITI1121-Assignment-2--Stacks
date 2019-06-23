/*MyCalculator.java
Noël Khalaf, Tony Kim
300079144, 300087407
ITI1121
*/
/*Utility class MyCalculator*/
public class MyCalculator{
	public static boolean isBalanced(String s){
		Stack<Character> stack = new ArrayStack<Character>(100);
		
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			if(c == '{' || c == '[' || c == '(' || c == '<'){
				stack.push(c);
			}
			else if(c == '}'){
				if(stack.isEmpty()){
					return false;
				}
				if(stack.pop() != '{'){
					return false;
				}
			}
			else if(c == ']'){
				if(stack.isEmpty()){
					return false;
				}
				if(stack.pop() != '['){
					return false;
				}
			}
			else if(c == ')'){
				if(stack.isEmpty()){
					return false;
				}
				if(stack.pop() != '('){
					return false;
				}
			}
			else if(c == '>'){
				if(stack.isEmpty()){
					return false;
				}
				if(stack.pop() != '<'){
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	public static String infixToPostfix(String infix){
		if(isBalanced()){
			String postfix = "";
			Stack<T> stack = new ArrayStack<T>(100);
			
			
		}
		else{
			return "infix is not a balanced expression";
		}
	}
}