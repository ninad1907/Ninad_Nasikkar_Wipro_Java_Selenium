package day_3_assignments_string;
//3. Check if a string is Palindrome 
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello";
		
		String original=str;
		
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		
		if(reverse.equals(original)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}
	}

}
