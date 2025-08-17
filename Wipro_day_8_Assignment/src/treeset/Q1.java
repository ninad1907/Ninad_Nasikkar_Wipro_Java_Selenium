/*Create a TreeSet of Strings:
o	Add 5 country names in random order.
o	Print the sorted list of countries using TreeSet.
*/
package treeset;

import java.util.TreeSet;

public class Q1 {
    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>();

        countries.add("India");
        countries.add("Australia");
        countries.add("Germany");
        countries.add("Brazil");
        countries.add("Canada");

        System.out.println("Sorted Countries: " + countries);
    }
}
