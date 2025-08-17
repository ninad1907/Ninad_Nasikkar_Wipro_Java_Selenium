package section3;

import java.util.Scanner;

//Write a program that uses a switch-case to simulate a basic calculator.
public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice for operation=");
		String choice=sc.nextLine();
		
		System.out.println("Enter first number=");
		int a=sc.nextInt();
		
		System.out.println("Enter second number=");
		int b=sc.nextInt();
		
		switch(choice) {
		case "+":
			int result1=a+b;
			System.out.println("Addition result is ="+result1);
			break;
			
		case "-":
			int result2=a-b;
			System.out.println("Subtraction result is ="+result2);
			break;
			
		case "*":
			int result3=a*b;
			System.out.println("Multiplication result is ="+result3);
			break;
			
		case "/":
			int result4=a/b;
			System.out.println("Division result is ="+result4);
			break;
			
		default:
			System.out.println("Invalid choice");
		}
	}

}
