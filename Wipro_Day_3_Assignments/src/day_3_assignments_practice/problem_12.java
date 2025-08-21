package day_3_assignments_practice;
//12. check palindrome number
public class problem_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12321;
		
		int original=num;
		
		int rev=0;
		
		while(num!=0) {
			int rem=num%10;
			
			rev=rev*10+rem;
			
			num=num/10;
		}
		System.out.println(rev);
		if(original==rev) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not Palindrome");
		}
		
		
	}

}
