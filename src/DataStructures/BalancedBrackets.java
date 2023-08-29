package DataStructures;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
      String expression = "([{}])";
      if(checkIfBalancedBracket(expression)) {
          System.out.println("Balanced");
      }
      else System.out.println("Not Balanced");
    }

    private static boolean checkIfBalancedBracket(String expression) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = expression.toCharArray();
        for ( int i =0; i < charArray.length ; i++) {
            if(isOpenBracket(charArray[i])) {
                stack.push(charArray[i]);
            } else if(  stack.isEmpty() || isClosedBracket(charArray[i])) {
                stack.pop();
            }
        }
        return false;
    }

    private static boolean isOpenBracket(char ch) {
        return ch == '(' || ch == '[' || ch == '{' ;
    }
    private  static boolean isClosedBracket(char ch) {
        return ch == ')' || ch == ']' || ch == '}' ;
    }

}
