package file_handling;

//20. Write a program to deserialize the employee.ser file and display the object data.
import java.io.*;

public class Q20 {
 public static void main(String[] args) {
     try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))) {
         Employee emp = (Employee) ois.readObject();
         System.out.println("Deserialized Employee: " + emp.id + ", " + emp.name);
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}

