package day_3_assignments_variables;
//3. Swap two numbers using third variable 
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=20;
		
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		
		int temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
	}

}
