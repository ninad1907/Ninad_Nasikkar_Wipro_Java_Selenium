package file_handling;

//11. Write a program to read a file using Scanner and display the tokens.
import java.io.*;
import java.util.*;

public class Q11 {
 public static void main(String[] args) {
     try (Scanner sc = new Scanner(new File("hello.txt"))) {
         while (sc.hasNext()) {
             System.out.println(sc.next());
         }
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}

