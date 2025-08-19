/*1. Reverse CharSequence: Custom BackwardSequence
•	Create a class BackwardSequence that implements java.lang.CharSequence.
•	Internally store a String and implement all required methods: length(), charAt(), subSequence(), and toString().
•	The sequence should be the reverse of the stored string (e.g., new BackwardSequence("hello") yields "olleh").
•	Write a main() method to test each method.
*/
package interfaces;

public class Q1 implements CharSequence {
    private final String reversed;

    public Q1(String original) {
        if (original == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        this.reversed = new StringBuilder(original).reverse().toString();
    }

    @Override
    public int length() {
        return reversed.length();
    }

    @Override
    public char charAt(int index) {
        if (index < 0 || index >= reversed.length()) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return reversed.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0 || end > reversed.length() || start > end) {
            throw new IndexOutOfBoundsException("Invalid start or end index");
        }
        return reversed.substring(start, end);
    }

    @Override
    public String toString() {
        return reversed;
    }

    public static void main(String[] args) {
        Q1 seq = new Q1("hello");

        System.out.println("Original: hello");
        System.out.println("Reversed: " + seq);
        System.out.println("Length: " + seq.length());
        System.out.println("Character at index 1: " + seq.charAt(1));
        System.out.println("Subsequence (1, 4): " + seq.subSequence(1, 4));
    }
}

