package files;

//Q1. Create and Write to a File
//Write a Java program to create a file named student.txt and write 5 lines of student names using FileWriter.

import java.io.FileWriter;
import java.io.IOException;

public class Q1 {
 public static void main(String[] args) {
     try (FileWriter writer = new FileWriter("student.txt")) {
         writer.write("Ninad\n");
         writer.write("Amit\n");
         writer.write("Priya\n");
         writer.write("Sahil\n");
         writer.write("Riya\n");
         System.out.println("Data written to student.txt successfully.");
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}
