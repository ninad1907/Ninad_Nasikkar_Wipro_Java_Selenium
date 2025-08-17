/*Create a base class Vehicle with method start().
Derive Car, Bike, and Truck from it and override the start() method.
•	Create a static method that accepts Vehicle type and calls start().
•	Pass different vehicle objects to test polymorphism.
________________________________________
*/
package combined_questions;

class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike started");
    }
}

class Truck extends Vehicle {
    @Override
    void start() {
        System.out.println("Truck started");
    }
}

public class Q3 {


    public static void main(String[] args) {
        Car ferrari = new Car();
        Bike pulsar = new Bike();
        Truck tata = new Truck();

        ferrari.start();
        pulsar.start();
        tata.start();
    }
}
