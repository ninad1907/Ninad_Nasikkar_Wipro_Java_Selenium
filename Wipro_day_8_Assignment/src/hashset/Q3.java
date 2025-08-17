/*3.	Write a method that takes a HashSet<Integer> and returns the maximum element.*/
package hashset;

import java.util.HashSet;

public class Q3{
    static int getMax(HashSet<Integer> set) {
        int max = Integer.MIN_VALUE;
        for (int n : set) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(12);
        numbers.add(45);
        numbers.add(7);
        numbers.add(89);
        numbers.add(32);

        System.out.println("Maximum element: " + getMax(numbers));
    }
}
