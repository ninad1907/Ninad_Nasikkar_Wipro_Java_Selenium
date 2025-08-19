package day_3_assignments_arrays;
//copy all elements from one array to another
import java.util.Arrays;

//copy all elements from one array to another 
public class Copy_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};
		
		int[] new_array=arr.clone();
		
		System.out.println("Original array = "+Arrays.toString(arr));
		System.out.println("Clone array = "+Arrays.toString(new_array));
	}

}
