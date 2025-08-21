package files;

//Q11. Print All Files in a Directory
//Write a program to list all files (not directories) inside a folder path given by the user.

import java.io.File;
import java.util.Scanner;

public class Q11 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter folder path: ");
     String path = sc.nextLine();

     File dir = new File(path);
     if (dir.isDirectory()) {
         File[] files = dir.listFiles(File::isFile);
         if (files != null) {
             for (File f : files) {
                 System.out.println(f.getName());
             }
         }
     } else {
         System.out.println("Invalid directory.");
     }
 }
}

