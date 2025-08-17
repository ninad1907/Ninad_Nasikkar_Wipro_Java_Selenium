package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AL_iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cities=new ArrayList<>(List.of("Pune","Mumbai","Chennai","Bhopal","Coimbatore"));
		
		Iterator it=cities.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
