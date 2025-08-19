/*1.	Bank Queue Simulation:
o	Create a queue of customer names using Queue<String>.
o	Add 5 customers to the queue.
o	Serve (remove) customers one by one and print the queue after each removal.
*/
package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Q1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Aarav");
        queue.add("Riya");
        queue.add("Kunal");
        queue.add("Meera");
        queue.add("Dev");

        while (!queue.isEmpty()) {
            System.out.println("Removed: " + queue.poll());
            System.out.println("Remaining Queue: " + queue);
        }
    }
}

