package file_handling;

//8. Write a program that lists all the files in a directory.
import java.io.*;

public class Q8 {
 public static void main(String[] args) {
     File folder = new File(".");
     String[] files = folder.list();
     if (files != null) {
         for (String f : files) {
             System.out.println(f);
         }
     }
 }
}

