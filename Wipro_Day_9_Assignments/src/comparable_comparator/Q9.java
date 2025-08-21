package comparable_comparator;

//Q9. Write a program that sorts a list of cities by population using Comparator.

import java.util.*;

class City {
 String name;
 int population;

 City(String name, int population) {
     this.name = name;
     this.population = population;
 }

 @Override
 public String toString() {
     return name + " " + population;
 }
}

public class Q9 {
 public static void main(String[] args) {
     List<City> cities = new ArrayList<>();
     cities.add(new City("Pune", 5000000));
     cities.add(new City("Mumbai", 20000000));
     cities.add(new City("Nagpur", 3000000));

     cities.sort(Comparator.comparingInt(c -> c.population));

     cities.forEach(System.out::println);
 }
}
