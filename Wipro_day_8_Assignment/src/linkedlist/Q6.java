/*. Iterate using ListIterator
Write a program to:
•	Create a LinkedList of cities.
•	Use ListIterator to display the list in both forward and reverse directions.
*/
package linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> cities=new LinkedList<>();
		
		cities.add("Pune");
		cities.add("Banglore");
		cities.add("Mumbai");
		cities.add("Chennai");
		cities.add("Delhi");
		cities.add("Kolkata");
		
		Iterator<String> it=cities.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Collections.reverse(cities);
		
		System.out.println("");
		Iterator<String> it1=cities.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	}

}
