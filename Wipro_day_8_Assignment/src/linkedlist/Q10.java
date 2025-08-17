/*Clone a LinkedList
Write a program to:
•	Create a LinkedList of numbers.
•	Clone it using the clone() method.
•	Display both original and cloned lists.
*/
package linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> numbers=new LinkedList<>(List.of(7,2,5,1,4,9,23,16,72));
		System.out.println("Original list ="+numbers);
		
		numbers.clone();
		
		System.out.println("Cloned list ="+numbers);
	}

}
