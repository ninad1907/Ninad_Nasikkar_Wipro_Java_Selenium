/*Rectangle Enforced Positive Dimensions
Encapsulate validation and provide derived calculations.
•	Build a Rectangle class with private width and height.
•	Constructor and setters should reject or correct non-positive values (e.g., use default or throw an exception).
•	Provide getArea() and getPerimeter() methods.
•	Include displayDetails() method.
*/
package encapsulation;

class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Width can't be zero or negative. Setting to default value 1.");
            this.width = 1;
        }

        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Height can't be zero or negative. Setting to default value 1.");
            this.height = 1;
        }
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
            System.out.println("Width updated to " + width);
        } else {
            System.out.println("Invalid width. No changes made.");
        }
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
            System.out.println("Height updated to " + height);
        } else {
            System.out.println("Invalid height. No changes made.");
        }
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void displayDetails() {
        System.out.println("Rectangle Details:");
        System.out.println("- Width: " + width);
        System.out.println("- Height: " + height);
        System.out.println("- Area: " + getArea());
        System.out.println("- Perimeter: " + getPerimeter());
    }
}

public class Q2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(-3, 8);

        System.out.println();
        r1.displayDetails();
        System.out.println();
        r2.displayDetails();

        System.out.println("\nUpdating dimensions...");
        r1.setWidth(-7);
        r1.setHeight(15);

        System.out.println();
        r1.displayDetails();
    }
}
