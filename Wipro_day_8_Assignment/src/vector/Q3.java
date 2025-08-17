/*•	Write a program to:
•	Copy all elements from one Vector to another Vector.
•	Compare both vectors for equality.
*/
package vector;

import java.util.Vector;

public class Q3 {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();
        v1.add(10);
        v1.add(20);
        v1.add(30);

        Vector<Integer> v2 = new Vector<>(v1);

        System.out.println("Vector 1: " + v1);
        System.out.println("Vector 2: " + v2);

        System.out.println("Are both vectors equal? " + v1.equals(v2));
    }
}
