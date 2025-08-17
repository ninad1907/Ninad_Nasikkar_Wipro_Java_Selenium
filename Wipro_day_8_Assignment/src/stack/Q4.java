//•	Convert a decimal number to binary using Stack
package stack;

import java.util.Stack;

public class Q4{
    static String decimalToBinary(int num) {
        Stack<Integer> stack = new Stack<>();
        while (num > 0) {
            stack.push(num % 2);
            num /= 2;
        }
        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        int decimal = 25;
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + decimalToBinary(decimal));
    }
}
