package comparable_comparator;

//Q14. Use Comparator.comparing() with method references to sort objects in Java 8+.

import java.util.*;

class Person {
 int id;
 String name;
 int age;

 Person(int id, String name, int age) {
     this.id = id;
     this.name = name;
     this.age = age;
 }

 @Override
 public String toString() {
     return id + " " + name + " " + age;
 }
}

public class Q14 {
 public static void main(String[] args) {
     List<Person> people = new ArrayList<>();
     people.add(new Person(1, "Ninad", 25));
     people.add(new Person(2, "Amit", 30));
     people.add(new Person(3, "Ravi", 28));

     people.sort(Comparator.comparing(p -> p.name));

     people.forEach(System.out::println);
 }
}
