package files;

//Q10. Read Serialized Object from File
//Deserialize the student.ser file and display the object's content on the console.

import java.io.*;

public class Q10 {
 public static void main(String[] args) {
     try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
         Student s = (Student) ois.readObject();
         System.out.println("ID: " + s.id + ", Name: " + s.name + ", Marks: " + s.marks);
     } catch (IOException | ClassNotFoundException e) {
         e.printStackTrace();
     }
 }
}
