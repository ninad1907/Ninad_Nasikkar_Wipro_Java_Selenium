package arraylist;

import java.util.ArrayList;
import java.util.List;

public class AL_update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> subjects=new ArrayList<>(List.of("Physics","Chemistry","Biology","Maths","EVS"));
		
		System.out.println("List before update ="+subjects);
		
		subjects.set(4, "Statistics");
		
		System.out.println("List after update ="+subjects);
		
	}

}
