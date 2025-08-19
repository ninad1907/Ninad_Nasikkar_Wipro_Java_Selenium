package file_handling;

//2. Write a program to check whether a file exists at a given path.
import java.io.*;

public class Q2 {
 public static void main(String[] args) {
     File file = new File("test.txt");
     if (file.exists()) {
         System.out.println("File exists at: " + file.getAbsolutePath());
     } else {
         System.out.println("File does not exist.");
     }
 }
}

