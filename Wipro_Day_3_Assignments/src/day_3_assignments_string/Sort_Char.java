package day_3_assignments_string;

import java.util.Arrays;

//Write a program to sort characters of a String Alphabetically
public class Sort_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Rishab";
		
		name=name.toLowerCase();
		
		char[] arr=name.toCharArray();
		
		Arrays.sort(arr);
		
		String result=new String(arr);
		
		System.out.println(result);
	}

}
