/*Q2. Create a Product class and sort products by price using Comparable.
Implement Comparable<Product> and sort a list of products using Collections.sort().
________________________________________
*/
package comparable_comparator;

import java.util.*;

class Product implements Comparable<Product> {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product p) {
        return Double.compare(this.price, p.price);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price;
    }
}

public class Q2 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 55000));
        products.add(new Product(2, "Mobile", 25000));
        products.add(new Product(3, "Tablet", 30000));

        Collections.sort(products);
        products.forEach(System.out::println);
    }
}

