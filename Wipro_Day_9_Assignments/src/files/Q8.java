package files;

//Q8. Reverse File Content
//Write a program to read a file data.txt and create another file reversed.txt containing the lines in reverse order.

import java.io.*;
import java.util.*;

public class Q8 {
 public static void main(String[] args) {
     List<String> lines = new ArrayList<>();
     try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
         String line;
         while ((line = br.readLine()) != null) {
             lines.add(line);
         }
     } catch (IOException e) {
         e.printStackTrace();
     }

     Collections.reverse(lines);

     try (BufferedWriter bw = new BufferedWriter(new FileWriter("reversed.txt"))) {
         for (String l : lines) {
             bw.write(l);
             bw.newLine();
         }
         System.out.println("Reversed content written to reversed.txt");
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}
