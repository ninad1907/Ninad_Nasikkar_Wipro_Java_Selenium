/*Q4. Sort a list of Book objects by bookId in descending order using Comparable.
Hint: Override compareTo() to return the reverse order.
*/
package comparable_comparator;

import java.util.*;

class Book implements Comparable<Book> {
    int bookId;
    String title;

    Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
    }

    @Override
    public int compareTo(Book b) {
        return Integer.compare(b.bookId, this.bookId); // Descending
    }

    @Override
    public String toString() {
        return bookId + " " + title;
    }
}

public class Q4 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(3, "AI"));
        books.add(new Book(1, "Java"));
        books.add(new Book(2, "Cloud"));

        Collections.sort(books);
        books.forEach(System.out::println);
    }
}

