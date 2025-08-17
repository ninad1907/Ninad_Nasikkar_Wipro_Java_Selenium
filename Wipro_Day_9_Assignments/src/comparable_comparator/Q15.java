package comparable_comparator;

//Q15. Use TreeSet with a custom comparator to sort a list of persons by age.

import java.util.*;

class Person1 {
 int id;
 String name;
 int age;

 Person1(int id, String name, int age) {
     this.id = id;
     this.name = name;
     this.age = age;
 }

 @Override
 public String toString() {
     return id + " " + name + " " + age;
 }
}

public class Q15 {
 public static void main(String[] args) {
     Set<Person1> set = new TreeSet<>(Comparator.comparingInt(p -> p.age));

     set.add(new Person1(1, "Ninad", 25));
     set.add(new Person1(2, "Amit", 30));
     set.add(new Person1(3, "Ravi", 28));

     set.forEach(System.out::println);
 }
}
