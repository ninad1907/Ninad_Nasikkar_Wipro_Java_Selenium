package file_handling;

//13. Write a program to create, move, and delete a file using Files and Paths.
import java.io.*;
import java.nio.file.*;

public class Q13 {
 public static void main(String[] args) {
     try {
         Path path = Paths.get("sample.txt");
         Files.createFile(path);
         System.out.println("File created.");
         Path moved = Paths.get("moved_sample.txt");
         Files.move(path, moved, StandardCopyOption.REPLACE_EXISTING);
         System.out.println("File moved.");
         Files.delete(moved);
         System.out.println("File deleted.");
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}

