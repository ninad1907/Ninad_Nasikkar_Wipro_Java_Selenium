/*3.	Create a TreeSet with a custom comparator:
o	Sort strings in reverse alphabetical order using Comparator.
*/
package treeset;

import java.util.TreeSet;
import java.util.Comparator;

public class Q3 {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>(Comparator.reverseOrder());

        names.add("Riya");
        names.add("Aarav");
        names.add("Kunal");
        names.add("Meera");
        names.add("Dev");

        System.out.println("Reverse Sorted Names: " + names);
    }
}

