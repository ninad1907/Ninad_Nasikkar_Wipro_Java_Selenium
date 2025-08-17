/*Q3. Create an Employee class and sort by name using Comparable.
Use the compareTo() method to sort alphabetically by employee names.
*/
package comparable_comparator;

import java.util.*;

class Employee implements Comparable<Employee> {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Employee e) {
        return this.name.compareTo(e.name);
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}

public class Q3 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101, "Ninad"));
        list.add(new Employee(103, "Amit"));
        list.add(new Employee(102, "Ravi"));

        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
