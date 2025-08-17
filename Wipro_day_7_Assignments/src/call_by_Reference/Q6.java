/*6.	Create a class Student with name and marks. Write a method to update the marks of a student. Demonstrate the changes in the original object.*/
package call_by_Reference;

class Student
{
    String name;
    int marks;

    Student(String name, int marks)
    {
        this.name = name;
        this.marks = marks;
    }
}

public class Q6
{
    public static void main(String[] args)
    {
        Student s = new Student("Ninad", 80);

        System.out.println("Before update: " + s.name + " - " + s.marks);

        updateMarks(s, 95);

        System.out.println("After update: " + s.name + " - " + s.marks);
    }

    static void updateMarks(Student student, int newMarks)
    {
        student.marks = newMarks;
        System.out.println("Inside method: " + student.name + " - " + student.marks);
    }
}

