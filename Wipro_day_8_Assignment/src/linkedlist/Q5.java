/*Search for an Element
Write a program to:
•	Create a LinkedList of Strings.
•	Ask the user for a string to search.
•	Display if the string is found or not
*/
package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> flowers=new LinkedList<>();
		
		flowers.add("Sunflower");
		flowers.add("Lotus");
		flowers.add("Rose");
		flowers.add("Jasmine");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your favourite flower");
		String fl=sc.nextLine();
		
		if(flowers.contains(fl)) {
			System.out.println("Your favourite flower is present in the nursery");
		}
		else {
			System.out.println("Your favourite flower is not present in the nursery");
		}
	}

}
