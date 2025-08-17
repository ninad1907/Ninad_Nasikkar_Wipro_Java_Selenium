/*3.	Write a method:
o	That takes a queue of integers and returns a list of even numbers.
*/
package queue;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Q3 {
    static List<Integer> getEvenNumbers(Queue<Integer> numbers) {
        List<Integer> evens = new ArrayList<>();
        for (int n : numbers) {
            if (n % 2 == 0) {
                evens.add(n);
            }
        }
        return evens;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(5);
        q.add(12);
        q.add(7);
        q.add(20);
        q.add(33);

        System.out.println("Even Numbers: " + getEvenNumbers(q));
    }
}
