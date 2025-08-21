package day_3_assignments_arrays;
//write a progrsearcham to search for a number entered by the user in an array
import java.util.*;
public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {11,22,33,44,55};
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number = ");
		int target=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.println("Number "+arr[i]+" is present");
				break;
			}
		}
	}

}
