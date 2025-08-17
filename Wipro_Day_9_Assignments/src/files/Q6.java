package files;

//Q6. Check if a File Exists and Display Properties
//Create a program to check if report.txt exists. If it does, display its properties.

import java.io.File;

public class Q6 {
 public static void main(String[] args) {
     File file = new File("report.txt");
     if (file.exists()) {
         System.out.println("Absolute Path: " + file.getAbsolutePath());
         System.out.println("File Name: " + file.getName());
         System.out.println("Writable: " + file.canWrite());
         System.out.println("Readable: " + file.canRead());
         System.out.println("File Size: " + file.length() + " bytes");
     } else {
         System.out.println("File does not exist.");
     }
 }
}
