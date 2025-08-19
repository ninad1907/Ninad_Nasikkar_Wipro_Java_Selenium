/*Design an abstract class Person with fields like name, age, and abstract method getRoleInfo().
Create subclasses:
•	Student: has course and roll number.
•	Professor: has subject and salary.
•	TeachingAssistant: extends Student and implements getRoleInfo() in a hybrid way.
•	Create and print info for all roles using overridden getRoleInfo().
________________________________________
*/
package combined_questions;

abstract class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    abstract void getRoleInfo();
}

class Student extends Person {
    String course;
    int rollNo;
    Student(String name, int age, String course, int rollNo) {
        super(name, age);
        this.course = course;
        this.rollNo = rollNo;
    }
    @Override
    void getRoleInfo() {
        System.out.println("Student: " + name + ", Age: " + age + ", Course: " + course + ", Roll No: " + rollNo);
    }
}

class Professor extends Person {
    String subject;
    double salary;
    Professor(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }
    @Override
    void getRoleInfo() {
        System.out.println("Professor: " + name + ", Age: " + age + ", Subject: " + subject + ", Salary: " + salary);
    }
}

class TeachingAssistant extends Student {
    String responsibility;
    TeachingAssistant(String name, int age, String course, int rollNo, String responsibility) {
        super(name, age, course, rollNo);
        this.responsibility = responsibility;
    }
    @Override
    void getRoleInfo() {
        System.out.println("Teaching Assistant: " + name + ", Age: " + age + ", Course: " + course + ", Roll No: " + rollNo + ", Responsibility: " + responsibility);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Person student = new Student("Aarav", 20, "Computer Science", 101);
        Person professor = new Professor("Dr. Sharma", 45, "Artificial Intelligence", 95000);
        Person ta = new TeachingAssistant("Riya", 22, "Electronics", 202, "Lab Assistance");

        student.getRoleInfo();
        professor.getRoleInfo();
        ta.getRoleInfo();
    }
}
