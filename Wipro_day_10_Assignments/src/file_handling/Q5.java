package file_handling;

//5. Write a program to append a line of text to an existing file.
import java.io.*;

public class Q5 {
 public static void main(String[] args) {
     try (FileWriter fw = new FileWriter("hello.txt", true)) {
         fw.write("\nThis is an appended line.");
         System.out.println("Data appended successfully.");
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}
