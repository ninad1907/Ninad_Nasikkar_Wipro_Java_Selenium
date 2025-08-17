package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AL_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> vowels=new ArrayList<>(List.of('a','e','i','o','u'));
		
		Collections.reverse(vowels);
		
		System.out.println(vowels);
	}

}
