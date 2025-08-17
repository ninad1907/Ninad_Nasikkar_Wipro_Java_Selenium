package comparable_comparator;

//Q8. Sort Employee objects by joining date using Comparator.
//Use Comparator to sort employees based on LocalDate.

import java.util.*;
import java.time.LocalDate;

class Employee1 {
 int id;
 String name;
 LocalDate joiningDate;

 Employee1(int id, String name, LocalDate joiningDate) {
     this.id = id;
     this.name = name;
     this.joiningDate = joiningDate;
 }

 @Override
 public String toString() {
     return id + " " + name + " " + joiningDate;
 }
}

public class Q8 {
 public static void main(String[] args) {
     List<Employee1> employees = new ArrayList<>();
     employees.add(new Employee1(1, "Ninad", LocalDate.of(2022, 5, 1)));
     employees.add(new Employee1(2, "Amit", LocalDate.of(2020, 3, 15)));
     employees.add(new Employee1(3, "Ravi", LocalDate.of(2021, 7, 10)));

     employees.sort(Comparator.comparing(e -> e.joiningDate));

     employees.forEach(System.out::println);
 }
}

