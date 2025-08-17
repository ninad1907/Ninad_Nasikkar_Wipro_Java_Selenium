/*2.	Perform operations:
o	Remove an element.
o	Check if a city exists.
o	Clear the entire HashSet.
*/
package hashset;

import java.util.HashSet;

public class Q2 {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Chennai");
        cities.add("Bangalore");

        cities.remove("Delhi");

        System.out.println("Contains Mumbai? " + cities.contains("Mumbai"));

        cities.clear();

        System.out.println("HashSet after clear: " + cities);
    }
}
