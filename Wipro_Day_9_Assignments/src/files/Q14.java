package files;

//Q14. Replace a Word in a File
//Read content from story.txt, replace all occurrences of the word "Java" with "Python", and write the updated content to updated_story.txt

import java.io.*;

public class Q14 {
 public static void main(String[] args) {
     StringBuilder content = new StringBuilder();

     try (BufferedReader br = new BufferedReader(new FileReader("story.txt"))) {
         String line;
         while ((line = br.readLine()) != null) {
             content.append(line.replaceAll("Java", "Python")).append("\n");
         }
     } catch (IOException e) {
         e.printStackTrace();
     }

     try (BufferedWriter bw = new BufferedWriter(new FileWriter("updated_story.txt"))) {
         bw.write(content.toString());
         System.out.println("Updated content written to updated_story.txt");
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}
