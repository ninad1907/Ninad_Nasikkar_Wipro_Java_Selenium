/*2.	Print Jobs Priority:
o	Add different print jobs (String) with priority levels.
o	Use PriorityQueue to simulate serving high-priority jobs before others.
*/
package priorotyqueue;

import java.util.PriorityQueue;
import java.util.Comparator;

class PrintJob {
    String name;
    int priority;

    PrintJob(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}

public class Q2 {
    public static void main(String[] args) {
        PriorityQueue<PrintJob> jobs = new PriorityQueue<>(Comparator.comparingInt((PrintJob j) -> j.priority).reversed());

        jobs.add(new PrintJob("Invoice", 3));
        jobs.add(new PrintJob("Presentation", 5));
        jobs.add(new PrintJob("Notes", 1));
        jobs.add(new PrintJob("Report", 4));

        while (!jobs.isEmpty()) {
            System.out.println("Printing: " + jobs.poll());
        }
    }
}
