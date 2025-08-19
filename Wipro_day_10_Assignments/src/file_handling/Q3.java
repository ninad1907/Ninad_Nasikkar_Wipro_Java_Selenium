package file_handling;

//3. Write a Java program to write "Hello, World!" into a file using FileWriter.
import java.io.*;

public class Q3 {
 public static void main(String[] args) {
     try (FileWriter fw = new FileWriter("hello.txt")) {
         fw.write("Hello, World!");
         System.out.println("Data written successfully.");
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}
