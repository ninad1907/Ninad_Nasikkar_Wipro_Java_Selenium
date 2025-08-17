package files;

//Q2. Read from a File
//Write a program to read the contents of student.txt and display them line by line using BufferedReader.

import java.io.*;

public class Q2 {
 public static void main(String[] args) {
     try (BufferedReader br = new BufferedReader(new FileReader("student.txt"))) {
         String line;
         while ((line = br.readLine()) != null) {
             System.out.println(line);
         }
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}

