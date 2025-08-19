/*2.	Create a TreeSet of Integers:
o	Add some numbers and print the first and last elements.
o	Find the elements lower than and higher than a given number using lower() and higher() methods.
*/
package treeset;
import java.util.TreeSet;

public class Q2{
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(15);
        numbers.add(5);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);

        System.out.println("TreeSet: " + numbers);
        System.out.println("First Element: " + numbers.first());
        System.out.println("Last Element: " + numbers.last());

        int key = 20;
        System.out.println("Lower than " + key + ": " + numbers.lower(key));
        System.out.println("Higher than " + key + ": " + numbers.higher(key));
    }
}
