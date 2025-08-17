package file_handling;

//19. Write a program to serialize a class Employee and store it in employee.ser.
import java.io.*;

class Employee implements Serializable {
 int id; String name;
 Employee(int id, String name) {
     this.id = id; this.name = name;
 }
}

public class Q19 {
 public static void main(String[] args) {
     Employee emp = new Employee(101, "Ninad");
     try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
         oos.writeObject(emp);
         System.out.println("Employee serialized.");
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}

