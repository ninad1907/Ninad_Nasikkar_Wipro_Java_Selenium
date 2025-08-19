package day_3_assignments_arrays;
//segregate even and odd numbers  
import java.util.ArrayList;
public class Odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,33,4,67,98};
		
		ArrayList<Integer> even_list=new ArrayList<>();
		ArrayList<Integer> odd_list=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even_list.add(arr[i]);
			}else {
				odd_list.add(arr[i]);
			}
		}
		System.out.println("even numbers = "+even_list);
		System.out.println("odd numbers = "+odd_list);
	}

}
