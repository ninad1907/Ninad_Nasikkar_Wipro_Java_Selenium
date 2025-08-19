package file_handling;

//7. Write a program to copy content from one file to another using FileReader and FileWriter.
import java.io.*;

public class Q7 {
 public static void main(String[] args) {
     try (FileReader fr = new FileReader("hello.txt");
          FileWriter fw = new FileWriter("copy.txt")) {
         int c;
         while ((c = fr.read()) != -1) {
             fw.write(c);
         }
         System.out.println("File copied successfully.");
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}
