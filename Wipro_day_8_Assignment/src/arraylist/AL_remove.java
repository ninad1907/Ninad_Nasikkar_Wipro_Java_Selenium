package arraylist;

import java.util.ArrayList;
import java.util.List;

public class AL_remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> fruits=new ArrayList<>(List.of("Mango","Apple","Banana","Pomegranate","Chickoo"));
		
		fruits.remove("Apple");
	
		System.out.println(fruits);
	}

}
