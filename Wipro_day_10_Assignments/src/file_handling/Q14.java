package file_handling;

//14. Write a program to read all lines of a file using Files.readAllLines() and print them.
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Q14 {
 public static void main(String[] args) {
     try {
         List<String> lines = Files.readAllLines(Paths.get("hello.txt"));
         for (String line : lines) {
             System.out.println(line);
         }
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}

