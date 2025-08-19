package comparable_comparator;

//Q13. Write a menu-driven program to sort Employee objects by name, salary, or department using Comparator.

import java.util.*;
import java.util.Scanner;

class Employees {
 int id;
 String name;
 double salary;
 String department;

 Employees(int id, String name, double salary, String department) {
     this.id = id;
     this.name = name;
     this.salary = salary;
     this.department = department;
 }

 @Override
 public String toString() {
     return id + " " + name + " " + salary + " " + department;
 }
}

public class Q13 {
 public static void main(String[] args) {
     List<Employees> employees = new ArrayList<>();
     employees.add(new Employees(1, "Ninad", 50000, "IT"));
     employees.add(new Employees(2, "Amit", 60000, "HR"));
     employees.add(new Employees(3, "Ravi", 40000, "Finance"));

     Scanner sc = new Scanner(System.in);
     System.out.println("1. Sort by Name\n2. Sort by Salary\n3. Sort by Department");
     int choice = sc.nextInt();

     switch (choice) {
         case 1:
             employees.sort(Comparator.comparing(e -> e.name));
             break;
         case 2:
             employees.sort(Comparator.comparingDouble(e -> e.salary));
             break;
         case 3:
             employees.sort(Comparator.comparing(e -> e.department));
             break;
         default:
             System.out.println("Invalid Choice");
     }

     employees.forEach(System.out::println);
     sc.close();
 }
}
