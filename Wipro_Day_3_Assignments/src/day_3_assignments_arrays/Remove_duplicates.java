package day_3_assignments_arrays;
//remove duplicate elements from an array 
import java.util.HashSet;
public class Remove_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,44,32,6,1,2};
		
		HashSet<Integer> set=new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		
		System.out.println(set);
	}

}
