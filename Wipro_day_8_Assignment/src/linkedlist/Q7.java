/*Sort a LinkedList
Write a program to:
•	Create a LinkedList of integers.
•	Add unsorted numbers.
•	Sort the list using Collections.sort().
•	Display the sorted list.
*/
package linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> numbers=new LinkedList<>(List.of(7,2,5,1,4,9,23,16,72));
		
		Collections.sort(numbers);
		
		System.out.println(numbers);
		
	}

}
