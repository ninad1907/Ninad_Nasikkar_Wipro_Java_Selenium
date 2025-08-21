package day_3_assignments_string;
//Write a Program to count digits, letters, spaces and Special characters
public class Count_All {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="AbilH123$@ Raj L$3gh";
		int count_digits=0;
		int count_spaces=0;
		int count_letters=0;
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				count_digits++;
			}
			else if(str.charAt(i)==' ') {
				count_spaces++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				count_letters++;
			}
			
		}
		int special_count=str.length()-(count_digits+count_spaces+count_letters);
		
		System.out.println("letters = "+count_letters);
		System.out.println("digits = "+count_digits);
		System.out.println("spaces = "+count_spaces);
		System.out.println("special characters = "+special_count);
	}

}
