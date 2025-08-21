package day_3_assignments_practice;
//11. count total digits in a number
public class problem_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
		
		int count=0;
		
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
	
//		System.out.println((int)Math.log10(num)+1);
	}

}

//1/10==0 and 1%10==1