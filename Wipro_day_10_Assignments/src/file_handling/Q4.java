package file_handling;

//4. Write a program to read the content of a file line by line using BufferedReader.
import java.io.*;

public class Q4 {
 public static void main(String[] args) {
     try (BufferedReader br = new BufferedReader(new FileReader("hello.txt"))) {
         String line;
         while ((line = br.readLine()) != null) {
             System.out.println(line);
         }
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}
