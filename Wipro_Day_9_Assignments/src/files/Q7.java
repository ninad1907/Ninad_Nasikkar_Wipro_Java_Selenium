package files;

//Q7. Create a File and Accept User Input
//Accept input from the user (using Scanner) and write the input to a file named userinput.txt.

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q7 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter text to write into userinput.txt: ");
     String input = sc.nextLine();

     try (FileWriter writer = new FileWriter("userinput.txt")) {
         writer.write(input);
         System.out.println("Data written successfully.");
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}
