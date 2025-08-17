/*1.	Create a class Calculator with the following overloaded add()
1.add(int a, int b)
2.add(int a, int b, int c)
3.add(double a, double b)
*/
package polymorphism;

class Calculator{
	int add(int a,int b) {
		return a+b;
	}
	
	int add(int a,int b,int c) {
		return a+b+c;
	}
	
	double add(double a,double b) {
		return a+b;
	}
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1=new Calculator();
		System.out.println(c1.add(10, 5));
		System.out.println(c1.add(4, 8, 2));
		System.out.println(c1.add(3.5, 5.6));
	}

}
