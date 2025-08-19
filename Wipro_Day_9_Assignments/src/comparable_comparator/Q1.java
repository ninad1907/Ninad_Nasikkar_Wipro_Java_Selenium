/*Q1. Sort a list of students by roll number (ascending) using Comparable.
Create a Student class with fields: rollNo, name, and marks. Implement the Comparable interface to sort students by their roll numbers.
*/
package comparable_comparator;

import java.util.*;

class Student implements Comparable<Student> {
    int rollNo;
    String name;
    double marks;

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student s) {
        return Integer.compare(this.rollNo, s.rollNo);
    }

    @Override
    public String toString() {
        return rollNo + " " + name + " " + marks;
    }
}

public class Q1 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Ninad", 85));
        list.add(new Student(1, "Amit", 90));
        list.add(new Student(2, "Ravi", 78));

        Collections.sort(list);
        list.forEach(System.out::println);
    }
}

