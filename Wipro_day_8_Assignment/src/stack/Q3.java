/*•	Use Stack to check for balanced parentheses in an expression.
•	Input: (a+b) * (c-d)
•	Output: Valid or Invalid expression
*/
package stack;

import java.util.Stack;

public class Q3 {
    static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expr.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expr = "(a+b) * (c-d)";
        System.out.println(expr + " -> " + (isBalanced(expr) ? "Valid" : "Invalid"));
    }
}

