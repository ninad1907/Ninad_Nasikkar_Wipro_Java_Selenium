package files;

//Q13. Word Search in a File
//Ask the user to enter a word and check whether it exists in the file notes.txt.

import java.io.*;
import java.util.Scanner;

public class Q13 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter word to search: ");
     String word = sc.nextLine();
     boolean found = false;

     try (BufferedReader br = new BufferedReader(new FileReader("notes.txt"))) {
         String line;
         while ((line = br.readLine()) != null) {
             if (line.contains(word)) {
                 found = true;
                 break;
             }
         }
     } catch (IOException e) {
         e.printStackTrace();
     }

     if (found) {
         System.out.println("Word found in file.");
     } else {
         System.out.println("Word not found in file.");
     }
 }
}
