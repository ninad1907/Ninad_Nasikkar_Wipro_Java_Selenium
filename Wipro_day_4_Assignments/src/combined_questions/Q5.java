/*•	Interface Drawable with method draw()
•	Abstract class Shape with abstract method area()
Subclasses: Circle, Rectangle, and Triangle.
•	Calculate area using appropriate formulas.
•	Demonstrate how interface and abstract class work together.
*/
package combined_questions;

interface Drawable {
    void draw();
}

abstract class Shape implements Drawable {
    abstract double area();
}

class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    public void draw() {
        System.out.println("Drawing Circle");
    }
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
    double area() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base, height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public void draw() {
        System.out.println("Drawing Triangle");
    }
    double area() {
        return 0.5 * base * height;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 8);

        circle.draw();
        System.out.println("Circle Area: " + circle.area());

        rectangle.draw();
        System.out.println("Rectangle Area: " + rectangle.area());

        triangle.draw();
        System.out.println("Triangle Area: " + triangle.area());
    }
}

