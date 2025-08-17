package files;
//Q9. Store Objects in a File using Serialization
//Create a Student class with id, name, and marks. Serialize one object and save it in a file named student.ser.

import java.io.*;

class Student implements Serializable {
 int id;
 String name;
 int marks;

 Student(int id, String name, int marks) {
     this.id = id;
     this.name = name;
     this.marks = marks;
 }
}

public class Q9 {
 public static void main(String[] args) {
     Student s = new Student(1, "Ninad", 90);

     try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
         oos.writeObject(s);
         System.out.println("Student object serialized to student.ser");
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}

