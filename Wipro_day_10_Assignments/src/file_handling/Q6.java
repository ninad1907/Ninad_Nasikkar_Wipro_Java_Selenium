package file_handling;

//6. Write a program to count the number of lines, words, and characters in a file.
import java.io.*;

public class Q6 {
 public static void main(String[] args) {
     int lines = 0, words = 0, chars = 0;
     try (BufferedReader br = new BufferedReader(new FileReader("hello.txt"))) {
         String line;
         while ((line = br.readLine()) != null) {
             lines++;
             chars += line.length();
             words += line.split("\\s+").length;
         }
         System.out.println("Lines: " + lines);
         System.out.println("Words: " + words);
         System.out.println("Characters: " + chars);
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}

