package arraylist;

import java.util.ArrayList;
import java.util.List;

public class AL_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Float> points1=new ArrayList<>(List.of(77.5f,96.2f,43.7f,78.1f));
		ArrayList<Float> points2=new ArrayList<>();
		
		points2.addAll(points1);
		
		System.out.println(points2);
	}

}
