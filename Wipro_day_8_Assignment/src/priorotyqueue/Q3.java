/*3.	Write a method:
o	To merge two PriorityQueue<Integer> and return a sorted merged queue.
*/
package priorotyqueue;

import java.util.PriorityQueue;

public class Q3 {
    static PriorityQueue<Integer> mergeQueues(PriorityQueue<Integer> q1, PriorityQueue<Integer> q2) {
        PriorityQueue<Integer> merged = new PriorityQueue<>(q1);
        merged.addAll(q2);
        return merged;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> q1 = new PriorityQueue<>();
        q1.add(10);
        q1.add(5);
        q1.add(20);

        PriorityQueue<Integer> q2 = new PriorityQueue<>();
        q2.add(15);
        q2.add(2);
        q2.add(30);

        PriorityQueue<Integer> merged = mergeQueues(q1, q2);

        System.out.println("Merged and Sorted Queue: " + merged);
    }
}

