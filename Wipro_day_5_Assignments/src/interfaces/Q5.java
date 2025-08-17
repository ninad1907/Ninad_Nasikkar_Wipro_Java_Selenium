/*Default and Static Methods in Interfaces
•	Declare interface Polygon with:
o	double getArea()
o	default method default double getPerimeter(int... sides) that computes sum of sides
o	a static helper static String shapeInfo() returning a description string
•	Implement classes Rectangle and Triangle, providing appropriate getArea().
•	In Main, call getPerimeter(...) and Polygon.shapeInfo().

*/
package interfaces;

interface Polygon
{
    double getArea();

    default double getPerimeter(double[] sides)
    {
        double perimeter = 0;
        for (int i = 0; i < sides.length; i++)
        {
            perimeter = perimeter + sides[i];
        }
        return perimeter;
    }


    static String shapeInfo()
    {
        return "Polygon shapes can calculate area and perimeter";
    }
}

class Rectangle implements Polygon
{
    double width;
    double height;

    Rectangle(double w, double h)
    {
        width = w;
        height = h;
    }

    public double getArea()
    {
        return width * height;
    }
}

class Triangle implements Polygon
{
    double a, b, c, height;

    Triangle(double a, double b, double c, double height)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
    }

    public double getArea()
    {
        return 0.5 * a * height;
    }
}

public class Q5
{
    public static void main(String[] args)
    {
    	Rectangle rect = new Rectangle(5, 10);
    	double[] rectSides = {5, 10, 5, 10};
    	System.out.println("Rectangle perimeter: " + rect.getPerimeter(rectSides));

    	Triangle tri = new Triangle(3, 4, 5, 4);
    	double[] triSides = {3, 4, 5};
    	System.out.println("Triangle perimeter: " + tri.getPerimeter(triSides));

    }
}

