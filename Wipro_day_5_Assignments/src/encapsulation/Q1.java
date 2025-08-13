/*1. Student with Grade Validation & Configuration
Ensure marks are always valid and immutable once set.
•	Create a Student class with private fields: name, rollNumber, and marks.
•	Use a constructor to initialize all values and enforce marks to be between 0 and 100; invalid values reset to 0.
•	Provide getter methods, but no setter for marks (immutable after object creation).
•	Add displayDetails() to print all fields.

In future versions, you might allow updating marks only via a special inputMarks(int newMarks) method that has stricter logic (e.g. cannot reduce marks). Design accordingly.

*/
package encapsulation;

class Student {
    private String name;
    private int rollNumber;
    private int marks;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        if(marks >= 0 && marks <= 100) {
        	this.marks=marks;
        }
        else {
        	this.marks=0;
        }
  
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getMarks() {
        return marks;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    public void inputMarks(int newMarks) {
        if (newMarks >= 0 && newMarks <= 100 && newMarks >= this.marks) {
            this.marks = newMarks;
            System.out.println("Marks updated to: " + newMarks);
        } else {
            System.out.println("Invalid update: Marks cannot be out of range.");
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101, 85);
        Student s2 = new Student("Bob", 102, 120);

        s1.displayDetails();
        System.out.println();
        s2.displayDetails();

        System.out.println("\nTrying to update marks");
        s1.inputMarks(90);
        s1.inputMarks(80);
        s1.inputMarks(110);
    }
}

