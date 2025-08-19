/*Q5. Implement a program that sorts a list of custom objects using Comparable, and displays them before and after sorting.*/
package comparable_comparator;
import java.util.*;

class Car implements Comparable<Car> {
    int id;
    String model;

    Car(int id, String model) {
        this.id = id;
        this.model = model;
    }

    @Override
    public int compareTo(Car c) {
        return this.id - c.id;
    }

    @Override
    public String toString() {
        return id + " " + model;
    }
}

public class Q5 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(3, "BMW"));
        cars.add(new Car(1, "Audi"));
        cars.add(new Car(2, "Tesla"));

        System.out.println("Before Sorting:");
        cars.forEach(System.out::println);

        Collections.sort(cars);

        System.out.println("After Sorting:");
        cars.forEach(System.out::println);
    }
}
