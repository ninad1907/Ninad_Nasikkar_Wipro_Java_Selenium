package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AL_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>(List.of(10,20,30,40,50,60,70));
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number of your choice =");
		int num=sc.nextInt();
		
		if(list.contains(num)) {
			System.out.println(num+" exists in the list");
		}
		else {
			System.out.println(num+" does not exist in the list");
		}
	}

}
