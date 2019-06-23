/*MyCalculator.java
Noël Khalaf, Tony Kim
300079144, 300087407
ITI1121
*/
/*Utility class MyCalculator*/
import java.util.Arrays;
import java.util.List;
public class MyCalculator{
  private static final char CURLY_OPEN = '{';
  private static final char CURLY_CLOSE = '}';
  private static final char ARROW_OPEN = '<';
  private static final char ARROW_CLOSE = '>';
  private static final char SQUARE_OPEN = '[';
  private static final char SQUARE_CLOSE = ']';
  private static final char ROUND_OPEN = '(';
  private static final char ROUND_CLOSE = ')';

  public static boolean isBalanced(String s){
		Stack<Character> stack = new ArrayStack<Character>(100);

		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			if(c == CURLY_OPEN || c == SQUARE_OPEN || c == ROUND_OPEN || c == ARROW_OPEN){
				stack.push(c);
			}
			else if(c == CURLY_CLOSE){
				if(stack.isEmpty()){
					return false;
				}
				if(stack.pop() != CURLY_OPEN){
					return false;
				}
			}
			else if(c == SQUARE_CLOSE){
				if(stack.isEmpty()){
					return false;
				}
				if(stack.pop() != SQUARE_OPEN){
					return false;
				}
			}
			else if(c == ROUND_CLOSE){
				if(stack.isEmpty()){
					return false;
				}
				if(stack.pop() != ROUND_OPEN){
					return false;
				}
			}
			else if(c == ARROW_CLOSE){
				if(stack.isEmpty()){
					return false;
				}
				if(stack.pop() != ARROW_OPEN){
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	public static String infixToPostfix(String infix){
		String postfix = " ";
  	String ops[] = {"(","{","[","<",")","}","]",">","+","-","*","/"};
		List<String> list = Arrays.asList(ops);
    String closedBrackets[] = {")","}","]",">"};
		List<String> listClosed = Arrays.asList(closedBrackets);
    String mult[] = {"*","/"};
		List<String> listMult = Arrays.asList(mult);
    String add[] = {"+","-"};
		List<String> listAdd = Arrays.asList(add);
    Stack<String> calcStack = new ArrayStack<String>(100);

    if(isBalanced(infix)){
      for(int i=0; i<infix.length(); i++){
        String c = String.valueOf(infix.charAt(i));
        if(isNumeric(c)){
        	postfix += c+' ';
        }
        else if(list.contains(c)){
          calcStack.push(c);
          if(listMult.contains(c) && listMult.contains(calcStack.peek())){
            postfix += calcStack.pop()+' ';
          	calcStack.push(c);
          }
          if(listAdd.contains(c) && listAdd.contains(calcStack.peek())){
            postfix += calcStack.pop()+' ';
          	calcStack.push(c);
          }
          if(listAdd.contains(c) && listMult.contains(calcStack.peek())){
            postfix += calcStack.pop()+' ';
            if(listAdd.contains(calcStack.peek())){
              postfix += calcStack.pop() +' ';
            }
            calcStack.push(c);
          }

          if(listClosed.contains(c)){
            postfix += calcStack.pop()+' ';
            if(listAdd.contains(calcStack.peek())){
              postfix += calcStack.pop()+' ';
            }
          	calcStack.pop();
          }
        }
        }
			while(calcStack.peek() != null){
        postfix += calcStack.pop() + ' ';
      }
      }
			else{
				String err = "The provided infix is invalid. Please try again.";
				return err;
			}
			return postfix;
    }
		public static boolean isNumeric(final String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;

    }
  	public static double evaluate(String postfix){
      Stack<String> evalStack = new ArrayStack<String>(100);
      for(int i=0; i<postfix.length(); i++){
        String c = String.valueOf(postfix.charAt(i));
        if(isNumeric(String.valueOf(c))){
          evalStack.push(c);
        }
        else if(c == "+"){
          double b = Double.parseDouble(evalStack.pop());
          double a = Double.parseDouble(evalStack.pop());
          double result = a+b;
          evalStack.push(Double.toString(result));
        }
        else if(c == "-"){
          double b = Double.parseDouble(evalStack.pop());
          double a = Double.parseDouble(evalStack.pop());
          double result = a-b;
          evalStack.push(Double.toString(result));
        }
        else if(c == "*"){
          double b = Double.parseDouble(evalStack.pop());
          double a = Double.parseDouble(evalStack.pop());
          double result = a*b;
          evalStack.push(Double.toString(result));
        }
        else if(c == "/"){
          double b = Double.parseDouble(evalStack.pop());
          double a = Double.parseDouble(evalStack.pop());
          double result = a/b;
          evalStack.push(Double.toString(result));
        }
      }
      return Double.parseDouble(evalStack.pop());
    }
	}
