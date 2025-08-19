package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AL_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums=new ArrayList<>(List.of(30,10,50,25,83,49,61));
		
		Collections.sort(nums);
		
		System.out.println(nums);
	}

}
