/*2.	Create a LinkedHashSet of custom objects (e.g., Student with id and name):
o	Override hashCode() and equals() properly.
o	Add at least 3 Student objects.
o	Try adding a duplicate student and check if it gets added.
*/
package linkedhashset;

import java.util.LinkedHashSet;
import java.util.Objects;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student s = (Student) obj;
        return this.id == s.id && this.name.equals(s.name);
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class Q2 {
    public static void main(String[] args) {
        LinkedHashSet<Student> students = new LinkedHashSet<>();

        students.add(new Student(1, "Aarav"));
        students.add(new Student(2, "Riya"));
        students.add(new Student(3, "Kunal"));
        students.add(new Student(2, "Riya"));

        System.out.println("Students: " + students);
    }
}
