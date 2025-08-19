package file_handling;

//1. Write a program to create a new text file named test.txt.
import java.io.*;

public class Q1 {
 public static void main(String[] args) {
     try {
         File file = new File("test.txt");
         if (file.createNewFile()) {
             System.out.println("File created: " + file.getName());
         } else {
             System.out.println("File already exists.");
         }
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}

