package day_3_assignments_arrays;
//write a program to print an array in reverse order
public class Array_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,33,4,67,98};
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
