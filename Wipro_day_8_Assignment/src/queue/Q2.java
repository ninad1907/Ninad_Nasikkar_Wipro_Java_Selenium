/*2.	Task Manager:
o	Queue of tasks (String values).
o	Add tasks, peek at the next task, and poll completed tasks.
*/
package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Q2 {
    public static void main(String[] args) {
        Queue<String> tasks = new LinkedList<>();

        tasks.add("Write Report");
        tasks.add("Send Email");
        tasks.add("Attend Meeting");
        tasks.add("Code Review");

        System.out.println("Next Task: " + tasks.peek());

        while (!tasks.isEmpty()) {
            System.out.println("Completed: " + tasks.poll());
            System.out.println("Remaining Tasks: " + tasks);
        }
    }
}

