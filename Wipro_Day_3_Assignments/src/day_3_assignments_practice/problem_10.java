package day_3_assignments_practice;
//10. Print Fibonacci series up to 10 terms 1 2 3 5...
public class problem_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=2;
		
		int num=10;
		for(int i=1;i<=num;i++) {
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
		}
	}

}
