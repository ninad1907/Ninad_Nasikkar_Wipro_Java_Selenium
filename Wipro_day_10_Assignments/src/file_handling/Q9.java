package file_handling;
//9. Write a program to filter and display only .txt files from a folder using FilenameFilter.
import java.io.*;

public class Q9 {
 public static void main(String[] args) {
     File folder = new File(".");
     FilenameFilter filter = (dir, name) -> name.endsWith(".txt");
     String[] files = folder.list(filter);
     if (files != null) {
         for (String f : files) {
             System.out.println(f);
         }
     }
 }
}
