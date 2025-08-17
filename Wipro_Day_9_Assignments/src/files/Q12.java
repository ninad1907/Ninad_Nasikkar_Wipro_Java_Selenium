package files;

//Q12. Delete a File
//Write a program to delete a file (given by file name) if it exists.

import java.io.File;
import java.util.Scanner;

public class Q12 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter file name to delete: ");
     String fileName = sc.nextLine();

     File file = new File(fileName);
     if (file.exists()) {
         if (file.delete()) {
             System.out.println("File deleted successfully.");
         } else {
             System.out.println("Failed to delete file.");
         }
     } else {
         System.out.println("File does not exist.");
     }
 }
}

