package file_handling;

//15. Write a program to write data into a file using Files.write() and append using StandardOpenOption.APPEND.
import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Q15 {
 public static void main(String[] args) {
     Path path = Paths.get("data.txt");
     try {
         Files.write(path, Arrays.asList("First line"), StandardCharsets.UTF_8);
         Files.write(path, Arrays.asList("Appended line"), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
         System.out.println("Data written and appended.");
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}
