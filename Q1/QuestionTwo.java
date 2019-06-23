import java.util.Scanner;
public class QuestionTwo{
  public static void main(String[] args){
    Scanner calcScan = new Scanner(System.in);
    Boolean finished = false;
    while(!finished){
      System.out.println("Enter an infix expression or q to quit: ");
      String expression = calcScan.nextLine();
      System.out.println(expression);
      expression.trim();
      if(expression.equalsIgnoreCase("q")){
        finished = true;
      }
      else{
        System.out.println(expression);
        if(MyCalculator.isBalanced(expression)){
          System.out.println(expression +" is balanced");
          String PostfixExpression = MyCalculator.infixToPostfix(expression);
          System.out.println(PostfixExpression+" is postfix representation");
          System.out.println(MyCalculator.evaluate(PostfixExpression)+" is its value");
        }
        else{
          System.out.println(expression + "is not balanced");
        }
      }
    }
    calcScan.close();
  }
}
