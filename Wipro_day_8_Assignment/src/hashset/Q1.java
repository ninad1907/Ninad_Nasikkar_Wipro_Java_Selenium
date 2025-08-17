/*1.	Create a HashSet of Strings:
o	Add 5 different city names.
o	Try adding a duplicate city and observe the output.
o	Iterate using an Iterator and print each city.
*/
package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Q1 {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Chennai");
        cities.add("Bangalore");

        cities.add("Pune");

        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

