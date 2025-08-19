package day_3_assignments_practice;
//7. check if a number is prime
public class problem_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=3;
		
		boolean isPrime=true;
		
		if(num<=1) {
			isPrime=false;
		}
		
		else {
			for(int i=2;i<Math.sqrt(num);i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
		}
		
		if(isPrime) {
			System.out.println(num+ " is Prime Number");
		}else {
			System.out.println(num+ " is Composite Number");
		}
	}

}
