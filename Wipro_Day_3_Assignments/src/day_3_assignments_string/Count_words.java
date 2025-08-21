package day_3_assignments_string;
//4. Count words in a Sentence 
public class Count_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome to Wipro";
		
		int count=0; 
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println("The total number of words are = "+(count+1));
	}

}
