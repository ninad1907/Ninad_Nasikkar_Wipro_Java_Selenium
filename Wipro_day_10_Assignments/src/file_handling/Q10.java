package file_handling;

//10. Write a program to serialize and deserialize a Student object to and from a file.
import java.io.*;

class Student implements Serializable {
 int id;
 String name;
 public Student(int id, String name) {
     this.id = id; this.name = name;
 }
 public String toString() {
     return id + " - " + name;
 }
}

public class Q10 {
 public static void main(String[] args) {
     Student s = new Student(1, "Ninad");
     try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
         oos.writeObject(s);
         System.out.println("Object serialized.");
     } catch (IOException e) { e.printStackTrace(); }

     try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
         Student obj = (Student) ois.readObject();
         System.out.println("Deserialized: " + obj);
     } catch (Exception e) { e.printStackTrace(); }
 }
}

