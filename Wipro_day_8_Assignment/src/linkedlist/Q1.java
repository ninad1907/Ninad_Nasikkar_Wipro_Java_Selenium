/*Create and Display a LinkedList
Write a program to:
•	Create a LinkedList of Strings.
•	Add five colors to it.
•	Display the list using a for-each loop.
*/
package linkedlist;

import java.util.LinkedList;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		LinkedList<String> list=new LinkedList<>();
		
		list.add("Blue");
		list.add("Red");
		list.add("Yellow");
		list.add("Black");
		list.add("Brown");
		
		for(String color:list) {
			System.out.println(color);
		}
	}

}
