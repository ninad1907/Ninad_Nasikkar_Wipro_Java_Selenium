/*. Remove Elements
Write a program to:
•	Create a LinkedList of animal names.
•	Remove the first and last elements.
•	Remove a specific element by value.
•	Display the list after each removal.
*/
package linkedlist;

import java.util.LinkedList;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> animals=new LinkedList<>();
		
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Elephant");
		animals.add("Giraffe");
		animals.add("Dog");
		animals.add("Fox");
		
		System.out.println("List of animals = "+animals);
		
		animals.removeFirst();
		
		System.out.println("List of animals after removing first animal = "+animals);
		
		animals.removeLast();
		
		System.out.println("List of animals after removing last animal = "+animals);
		
		animals.remove("Giraffe");
		
		System.out.println("List of animals = "+animals);
	}

}
