package file_handling;

//18. Write a program to check and print the size of a file in bytes using Files.size().
import java.io.*;
import java.nio.file.*;

public class Q18 {
 public static void main(String[] args) {
     try {
         long size = Files.size(Paths.get("hello.txt"));
         System.out.println("File size: " + size + " bytes");
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}

