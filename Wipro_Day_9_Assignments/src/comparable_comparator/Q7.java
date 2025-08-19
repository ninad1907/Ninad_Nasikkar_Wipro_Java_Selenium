package comparable_comparator;

//Q7. Create multiple sorting strategies for a Product class.
//Implement comparators to sort by:
//1. Price ascending
//2. Price descending
//3. Name alphabetically

import java.util.*;

class Products1 {
 int id;
 String name;
 double price;

 Products1(int id, String name, double price) {
     this.id = id;
     this.name = name;
     this.price = price;
 }

 @Override
 public String toString() {
     return id + " " + name + " " + price;
 }
}

public class Q7 {
 public static void main(String[] args) {
     List<Product> products = new ArrayList<>();
     products.add(new Product(1, "Laptop", 55000));
     products.add(new Product(2, "Mobile", 25000));
     products.add(new Product(3, "Tablet", 30000));

     System.out.println("Price Ascending:");
     products.sort(Comparator.comparingDouble(p -> p.price));
     products.forEach(System.out::println);

     System.out.println("\nPrice Descending:");
     products.sort((p1, p2) -> Double.compare(p2.price, p1.price));
     products.forEach(System.out::println);

     System.out.println("\nName Alphabetically:");
     products.sort(Comparator.comparing(p -> p.name));
     products.forEach(System.out::println);
 }
}
