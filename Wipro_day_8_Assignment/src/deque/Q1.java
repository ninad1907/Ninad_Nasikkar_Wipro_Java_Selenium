/*1.	Palindrome Checker:
o	Input a string and check if it is a palindrome using a Deque<Character>.
*/
package deque;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Q1 {
    static boolean isPalindrome(String str) {
        Deque<Character> deque = new LinkedList<>();
        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                deque.add(Character.toLowerCase(ch));
            }
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}

