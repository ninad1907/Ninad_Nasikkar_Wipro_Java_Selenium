/*Store Custom Objects in LinkedList
Write a program to:
•	Create a class Book with fields: id, title, and author.
•	Create a LinkedList of Book objects.
•	Add 3 books and display their details using a loop.
________________________________________
*/
package linkedlist;

import java.util.LinkedList;

class Book{
	int id;
	String title;
	String author;
	
	Book(int id,String title,String author){
		this.id=id;
		this.title=title;
		this.author=author;
		
	}
	
	public String toString() {
		return "id: " +id+", title: "+title+", author: "+author;
	}
}
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Book> list=new LinkedList<>();
		
		list.add(new Book(1,"Wings of Fire","APJ Abdul Kalam"));
		list.add(new Book(2,"Harry potter","JK Rowling"));
		list.add(new Book(3,"Famous Five","Enid Blyton"));
		
		for(Book bk:list) {
			System.out.println(bk);
		}
	}

}
