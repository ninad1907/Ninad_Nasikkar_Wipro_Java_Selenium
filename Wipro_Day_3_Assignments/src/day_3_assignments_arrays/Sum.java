package day_3_assignments_arrays;
//Write a program to find the sum of all elements in an integer array 
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		
		int sum=0;
		
		for(int num:arr) {
			sum+=num;
		}
		
		System.out.print(sum);
	}

}
