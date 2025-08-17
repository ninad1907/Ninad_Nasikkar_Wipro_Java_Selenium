/*•	Create a Vector of Strings and:
•	Add at least 4 names.
•	Check if a specific name exists in the vector.
•	Replace one name with another.
•	Clear all elements from the vector.
*/
package vector;

import java.util.Vector;

public class Q2 {
    public static void main(String[] args) {
        Vector<String> names = new Vector<>();

        names.add("Aarav");
        names.add("Riya");
        names.add("Kunal");
        names.add("Meera");

        System.out.println("Contains Riya? " + names.contains("Riya"));

        names.set(2, "Anika");

        System.out.println("Names after replacement: " + names);

        names.clear();

        System.out.println("Vector after clearing: " + names);
    }
}

