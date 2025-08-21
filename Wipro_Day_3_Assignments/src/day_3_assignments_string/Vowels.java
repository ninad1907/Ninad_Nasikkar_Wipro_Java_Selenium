package day_3_assignments_string;
//1. Count number of vowels in a string(input=”Programming”, output=3 Vowels) 
public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Programming";
		
		int count=0;
		
		input=input.toLowerCase();
		
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
			}
		}
		System.out.println("Vowel count: "+count);
	}

}
