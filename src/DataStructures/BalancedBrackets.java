package DataStructures;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
      String expression = "([{}]){}";
      if(checkIfBalancedBracket(expression)) {
          System.out.println("Balanced");
      }
      else System.out.println("Not Balanced");
    }

    private static boolean checkIfBalancedBracket(String expression) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = expression.toCharArray();
        for (char ch : charArray) {
            if(isOpenBracket(ch)) {
                stack.push(ch);
            } else if(isClosedBracket(ch))
             if(  stack.isEmpty() || !bracketsMatch(stack.pop(),ch)) {
                return  false;
            }
        }
        //if the stack is empty all brackets are balanced
        return stack.isEmpty();
    }

    private static boolean bracketsMatch(char open, char close) {
        return (open=='(' && close==')' || open == '[' && close == ']' || open == '{' && close == '}');
    }

    private static boolean isOpenBracket(char ch) {
        return ch == '(' || ch == '[' || ch == '{' ;
    }
    private  static boolean isClosedBracket(char ch) {
        return ch == ')' || ch == ']' || ch == '}' ;
    }

}
