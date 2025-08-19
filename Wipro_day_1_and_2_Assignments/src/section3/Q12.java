package section3;
//Write a Java program to display the multiplication table of a number using a loop.
public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=5;
		
		System.out.println("Multiplication table of  "+number);
		for(int i=1;i<=10;i++) {
			System.out.println(number+" * "+i+" = " +number*i);
		}
	}

}
