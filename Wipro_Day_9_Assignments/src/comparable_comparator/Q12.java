package comparable_comparator;

//Q12. Sort a list of Book objects using both Comparable (by ID) and Comparator (by title, then author).

import java.util.*;

class BookQ12 implements Comparable<BookQ12> {
 int bookId;
 String title;
 String author;

 BookQ12(int bookId, String title, String author) {
     this.bookId = bookId;
     this.title = title;
     this.author = author;
 }

 @Override
 public int compareTo(BookQ12 b) {
     return Integer.compare(this.bookId, b.bookId);
 }

 @Override
 public String toString() {
     return bookId + " - " + title + " by " + author;
 }
}

public class Q12 {
 public static void main(String[] args) {
     List<BookQ12> books = new ArrayList<>();
     books.add(new BookQ12(3, "Java", "James"));
     books.add(new BookQ12(1, "Python", "Guido"));
     books.add(new BookQ12(2, "C++", "Bjarne"));

     System.out.println("Sorting by ID (Comparable):");
     Collections.sort(books);
     for (BookQ12 b : books) {
         System.out.println(b);
     }

     System.out.println("\nSorting by Title then Author (Comparator):");
     Collections.sort(books, Comparator.comparing((BookQ12 b) -> b.title).thenComparing(b -> b.author));
     for (BookQ12 b : books) {
         System.out.println(b);
     }
 }
}

