package comparable_comparator;

//Q10. Use an anonymous inner class to sort a list of strings by length.

import java.util.*;

public class Q10 {
 public static void main(String[] args) {
     List<String> list = new ArrayList<>();
     list.add("Java");
     list.add("ArtificialIntelligence");
     list.add("Cloud");

     Collections.sort(list, new Comparator<String>() {
         @Override
         public int compare(String s1, String s2) {
             return s1.length() - s2.length();
         }
     });

     list.forEach(System.out::println);
 }
}
