package section3;
//Write a Java program using nested if statements.
public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=22;
		if(age>18) {
			System.out.println("The person is eligible to hold a driving license");
			
			if(age>21) {
				System.out.println("The person is eligible to drive a vehicle");
			}
		}
	}

}
