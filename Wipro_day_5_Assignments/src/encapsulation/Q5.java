/*. Builder Pattern & Encapsulation: Immutable Product
Use Builder design to create immutable class with encapsulation.
•	Create an immutable Product class with private final fields such as name, code, price, and optional category.
•	Use a static nested Builder inside the Product class. Provide methods like withName(), withPrice(), etc., that apply validation (e.g. non-negative price).
•	The outer class should have only getter methods, no setters.
•	The builder returns a new Product instance only when all validations succeed.
*/
package encapsulation;

public final class Q5 {
    private final String name;
    private final String code;
    private final double price;
    private final String category;

    public Q5(String name, String code, double price, String category) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Product name cannot be empty");
        }
        if (code == null || code.isBlank()) {
            throw new IllegalArgumentException("Product code cannot be empty");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.name = name;
        this.code = code;
        this.price = price;
        this.category = category != null ? category : "Uncategorized";
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public static void main(String[] args) {
        Q5 book = new Q5("Clean Code", "BK101", 39.99, "Programming");

        System.out.println("Name: " + book.getName());
        System.out.println("Code: " + book.getCode());
        System.out.println("Price: $" + book.getPrice());
        System.out.println("Category: " + book.getCategory());
    }
}


