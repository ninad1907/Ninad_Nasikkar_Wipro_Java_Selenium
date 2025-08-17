package files;

//Q4. Count Words and Lines
//Write a program to count the number of words and lines in a given text file notes.txt.

import java.io.*;

public class Q4 {
 public static void main(String[] args) {
     int lineCount = 0, wordCount = 0;
     try (BufferedReader br = new BufferedReader(new FileReader("notes.txt"))) {
         String line;
         while ((line = br.readLine()) != null) {
             lineCount++;
             wordCount += line.split("\\s+").length;
         }
         System.out.println("Lines: " + lineCount);
         System.out.println("Words: " + wordCount);
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}

