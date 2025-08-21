package file_handling;

//12. Write a program to search for a specific word in a file and count its occurrences.
import java.io.*;
import java.util.*;

public class Q12 {
 public static void main(String[] args) {
     String search = "Hello";
     int count = 0;
     try (Scanner sc = new Scanner(new File("hello.txt"))) {
         while (sc.hasNext()) {
             if (sc.next().equals(search)) count++;
         }
         System.out.println("Occurrences of '" + search + "': " + count);
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}

