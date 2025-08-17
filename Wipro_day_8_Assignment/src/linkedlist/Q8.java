/*Convert LinkedList to ArrayList
Write a program to:
•	Create a LinkedList of Strings.
•	Convert it into an ArrayList.
•	Display both the LinkedList and ArrayList.
*/
package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> state=new LinkedList<>();
		
		state.add("Maharashtra");
		state.add("Tamil Nadu");
		state.add("Andhra Pradesh");
		state.add("Kerala");
		state.add("Uttar Pradesh");
		
		ArrayList<String> new_list=new ArrayList<>(state);
		
		System.out.println("LinkedList = "+state);
		
		System.out.println("ArrayList = "+new_list);
	}

}
