/*2.	Double-ended Order System:
o	Add items from front and rear.
o	Remove items from both ends.
o	Display contents of the deque after each operation.
*/
package deque;

import java.util.Deque;
import java.util.LinkedList;

public class Q2 {
    public static void main(String[] args) {
        Deque<String> orders = new LinkedList<>();

        orders.addFirst("Order1");
        orders.addLast("Order2");
        orders.addFirst("Order0");
        orders.addLast("Order3");
        System.out.println("After adding: " + orders);

        orders.removeFirst();
        System.out.println("After removing from front: " + orders);

        orders.removeLast();
        System.out.println("After removing from rear: " + orders);
    }
}
