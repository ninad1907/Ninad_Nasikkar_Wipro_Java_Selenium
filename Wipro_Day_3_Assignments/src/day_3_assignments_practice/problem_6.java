package day_3_assignments_practice;
//6. print factorial of a number(eg. 5!=5*4*3*2*1)
public class problem_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=4;
		int fact=1;
		for(int i=num;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
