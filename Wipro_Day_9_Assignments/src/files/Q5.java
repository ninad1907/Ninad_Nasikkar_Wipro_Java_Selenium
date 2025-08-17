package files;

//Q5. Copy Contents from One File to Another
//Write a program to read from source.txt and write the same content into destination.txt.

import java.io.*;

public class Q5 {
 public static void main(String[] args) {
     try (BufferedReader br = new BufferedReader(new FileReader("source.txt"));
          BufferedWriter bw = new BufferedWriter(new FileWriter("destination.txt"))) {
         String line;
         while ((line = br.readLine()) != null) {
             bw.write(line);
             bw.newLine();
         }
         System.out.println("File copied successfully.");
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}
