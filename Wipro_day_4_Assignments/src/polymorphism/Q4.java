/*4.	Runtime Polymorphism with constructor Chaining                                                             
 * create a class vehicle with a constructor that prints “Vehicle Created”
Create a subclass Bike that override a method and uses super() in constructor
*/
package polymorphism;

class Vehicle {
    Vehicle() {
        System.out.println("Vehicle Created");
    }
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    Bike() {
        super();
        System.out.println("Bike Created");
    }
    @Override
    void run() {
        System.out.println("Bike is running");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.run();
    }
}
