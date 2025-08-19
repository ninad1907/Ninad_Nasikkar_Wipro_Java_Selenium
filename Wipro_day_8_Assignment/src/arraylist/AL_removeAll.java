package arraylist;

import java.util.ArrayList;
import java.util.List;

public class AL_removeAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> score=new ArrayList<>(List.of(98,58,26,7,45));
		
		score.clear();
		
		System.out.println(score.size());
	}

}
