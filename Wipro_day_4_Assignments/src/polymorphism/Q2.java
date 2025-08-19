/*2.	Create a base class Shape with a method area() that prints a message.  
 *      Then create two subclasses                           
 *      Circleoverride area() to calculator and print area of circle                                                 
 *      Rectangle override area() to calculate and print area of a rectangle*/
package polymorphism;

class Shape{
	void area() {
		System.out.println("Calculate area");
	}
}

class Circle extends Shape{
	float radius;
	Circle(float radius){
		this.radius=radius;
	}
	
	void area() {
		System.out.println("area of circle = "+3.14*radius*radius);
	}
}

class Rectangle extends Shape{
	int length;
	int breadth;
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	
	void area() {
		System.out.println("area of rectangle = "+length*breadth);
	}
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle(4.5f);
		c1.area();
		
		Rectangle r1=new Rectangle(3,5);
		r1.area();
	}

}
