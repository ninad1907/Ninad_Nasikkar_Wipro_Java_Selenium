package files;

//Q3. Append Data to a File
//Write a Java program to append a new student name to the existing student.txt file without overwriting existing data.

import java.io.FileWriter;
import java.io.IOException;

public class Q3 {
 public static void main(String[] args) {
     try (FileWriter writer = new FileWriter("student.txt", true)) {
         writer.write("NewStudent\n");
         System.out.println("New student added successfully.");
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}
