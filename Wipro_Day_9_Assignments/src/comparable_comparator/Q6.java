/*Q6. Sort a list of students by marks (descending) using Comparator.
Create a Comparator class or use a lambda expression to sort by marks
*/
package comparable_comparator;

import java.util.*;

class Student1 {
    int id;
    String name;
    double marks;

    Student1(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }
}

public class Q6 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Ninad", 85));
        list.add(new Student(2, "Amit", 92));
        list.add(new Student(3, "Ravi", 78));

        list.sort((s1, s2) -> Double.compare(s2.marks, s1.marks));

        list.forEach(System.out::println);
    }
}
