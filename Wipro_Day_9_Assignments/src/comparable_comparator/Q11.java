package comparable_comparator;

//Q11. Create a program where:
//Student implements Comparable to sort by name
//Use Comparator to sort by marks
//Demonstrate both sorting techniques in the same program.

import java.util.*;

class Students implements Comparable<Student> {
 int id;
 String name;
 double marks;

 Students(int id, String name, double marks) {
     this.id = id;
     this.name = name;
     this.marks = marks;
 }

 @Override
 public int compareTo(Student s) {
     return this.name.compareTo(s.name);
 }

 @Override
 public String toString() {
     return id + " " + name + " " + marks;
 }
}

public class Q11 {
 public static void main(String[] args) {
     List<Student> list = new ArrayList<>();
     list.add(new Student(1, "Ninad", 85));
     list.add(new Student(2, "Amit", 92));
     list.add(new Student(3, "Ravi", 78));

     System.out.println("Sorted by Name (Comparable):");
     Collections.sort(list);
     list.forEach(System.out::println);

     System.out.println("\nSorted by Marks (Comparator):");
     list.sort((s1, s2) -> Double.compare(s2.marks, s1.marks));
     list.forEach(System.out::println);
 }
}
