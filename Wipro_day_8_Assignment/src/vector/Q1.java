/*•	Create a Vector of integers and perform the following operations:
•	Add 5 integers to the Vector.
•	Insert an element at the 3rd position.
•	Remove the 2nd element.
•	Display the elements using Enumeration
*/
package vector;

import java.util.Vector;
import java.util.Enumeration;

public class Q1 {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        numbers.add(2, 99);

        numbers.remove(1);

        Enumeration<Integer> e = numbers.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}

