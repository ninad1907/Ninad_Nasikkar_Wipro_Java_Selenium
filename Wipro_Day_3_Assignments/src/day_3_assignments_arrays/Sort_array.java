package day_3_assignments_arrays;

import java.util.Arrays;

//Sort an array in ascending order
public class Sort_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {22,9,65,43,87,73};

		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
