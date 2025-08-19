/*Add Elements at First and Last Position
Write a program to:
•	Create a LinkedList of integers.
•	Add elements at the beginning and at the end.
•	Display the updated list.
*/
package linkedlist;

import java.util.LinkedList;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> nums=new LinkedList<>();
		
		nums.add(2);
		nums.add(3);
		
		nums.addFirst(1);
		nums.addLast(4);
		
		System.out.println(nums);
	}

}
