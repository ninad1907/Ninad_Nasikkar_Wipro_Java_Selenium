package day_3_assignments_arrays;

import java.util.Arrays;

//write a program to find out second highest element from an array 
public class Second_Highest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {44,10,23,77,5,95,53,68,99,37};
		
		int max=arr[0];
		int secondMax=arr[1];
		
		for(int i=2;i<arr.length;i++) {
			if(arr[i]>max) {
				secondMax=max;
				max=arr[i];
			}
			else if(arr[i]!=max && arr[i]>secondMax){
				secondMax=arr[i];
			}
		}
		
		System.out.println(secondMax+ ", "+max);
		Arrays.sort(arr);
		
		System.out.println(arr[arr.length-2]);
	}

}
