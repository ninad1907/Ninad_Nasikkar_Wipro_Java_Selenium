/*1.	Hospital Emergency Queue:
o	Create a class Patient with fields: name and severityLevel (int).
o	Use PriorityQueue<Patient> with a comparator to serve the most critical patients first (highest severityLevel).
*/
package priorotyqueue;

import java.util.PriorityQueue;
import java.util.Comparator;

class Patient {
    String name;
    int severityLevel;

    Patient(String name, int severityLevel) {
        this.name = name;
        this.severityLevel = severityLevel;
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severityLevel + ")";
    }
}

public class Q1 {
    public static void main(String[] args) {
        PriorityQueue<Patient> queue = new PriorityQueue<>(Comparator.comparingInt((Patient p) -> p.severityLevel).reversed());

        queue.add(new Patient("Aarav", 4));
        queue.add(new Patient("Riya", 7));
        queue.add(new Patient("Kunal", 2));
        queue.add(new Patient("Meera", 9));
        queue.add(new Patient("Dev", 5));

        while (!queue.isEmpty()) {
            System.out.println("Serving: " + queue.poll());
        }
    }
}
