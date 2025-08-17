/*. Insert Element at Specific Position
Write a program to:
•	Create a LinkedList of names.
•	Insert a name at index 2.
•	Display the list before and after insertion.
*/
package linkedlist;

import java.util.LinkedList;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> names=new LinkedList<>();
		
		names.add("Tanmay");
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Ajay");
		
		System.out.println("Before insertion = "+names);
		
		names.add(2, "Sunil");
		
		System.out.println("After insertion = "+names);
	}

}
