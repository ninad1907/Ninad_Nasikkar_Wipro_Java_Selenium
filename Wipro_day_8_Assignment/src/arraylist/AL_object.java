package arraylist;

import java.util.ArrayList;
import java.util.List;

class Student{
	int id;
	String name;
	float marks;
	
	Student(int id,String name,float marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	public String toString() {
		return id+" "+name+" "+marks;
	}
}
public class AL_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> info=new ArrayList<>();
		
		info.add(new Student(1,"Nishikant",89.5f));
		info.add(new Student(2,"Raj",73.8f));
		info.add(new Student(3,"Rahul",95.2f));
		
		for(Student s:info) {
			System.out.println(s);
		}
	}

}
