/*•	Create a Stack of integers and:
•	Push 5 elements.
•	Pop the top element.
•	Peek the current top.
•	Check if the stack is empty.
*/
package stack;

import java.util.Stack;

public class Q1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Popped: " + stack.pop());

        System.out.println("Top element: " + stack.peek());

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
