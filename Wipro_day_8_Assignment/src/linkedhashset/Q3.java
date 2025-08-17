/*3.	Write a program to:
o	Merge two LinkedHashSets and print the result.
*/
package linkedhashset;

import java.util.LinkedHashSet;

public class Q3{
    public static void main(String[] args) {
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);

        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(40);
        set2.add(20);
        set2.add(50);

        LinkedHashSet<Integer> merged = new LinkedHashSet<>(set1);
        merged.addAll(set2);

        System.out.println("Merged LinkedHashSet: " + merged);
    }
}

