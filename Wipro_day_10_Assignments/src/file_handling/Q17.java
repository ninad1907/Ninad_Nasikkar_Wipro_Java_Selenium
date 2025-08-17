package file_handling;

//17. Write a program to copy a file using Files.copy() with REPLACE_EXISTING option.
import java.io.*;
import java.nio.file.*;

public class Q17 {
 public static void main(String[] args) {
     try {
         Files.copy(Paths.get("hello.txt"), Paths.get("backup.txt"), StandardCopyOption.REPLACE_EXISTING);
         System.out.println("File copied.");
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}
