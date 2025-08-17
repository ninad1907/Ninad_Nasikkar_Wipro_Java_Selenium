/*•	Write a method that takes a Vector<Integer> and returns the sum of all elements.
*/
package vector;

import java.util.Vector;

public class Q4 {
    static int getSum(Vector<Integer> numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(5);
        v.add(10);
        v.add(15);
        v.add(20);

        System.out.println("Sum of elements: " + getSum(v));
    }
}

