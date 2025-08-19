package day_3_assignments_practice;
//13. sum of digits of number(6785=6+7+8+5)
public class problem_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234567;
		
		int sum=0;
		
		while(num!=0) {
			int rem=num%10;
			
			sum=sum+rem;
			
			num=num/10;
		}
		System.out.println(sum);
	}

}
