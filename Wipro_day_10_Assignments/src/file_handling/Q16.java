package file_handling;

//16. Write a program to walk through a directory tree and display file names using Files.walk().
import java.io.*;
import java.nio.file.*;

public class Q16 {
 public static void main(String[] args) {
     try {
         Files.walk(Paths.get("."))
              .forEach(System.out::println);
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}
