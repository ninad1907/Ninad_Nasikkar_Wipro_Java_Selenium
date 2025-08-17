//Write a Java program that demonstrates the use of all primitive data types
package section1;

class Employee{
	byte age=29;
	short height=172;
	int emp_id=1004;
	long mob_number=1234567890l; 
	float weight=68.9f;
	double salary=600000.00;
	char gender='M';
	boolean isMarried=true;
	
	void details() {
		System.out.println("The age of employee is="+age);
		System.out.println("The height of employee is="+height);
		System.out.println("The id of employee is="+emp_id);
		System.out.println("The mobile number of employee is="+mob_number);
		System.out.println("The weight of employee is="+weight);
		System.out.println("The salary of employee is="+salary);
		System.out.println("The gender of employee is="+gender);
		System.out.println("Is employee married="+isMarried);
	}
}

public class Q3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee Rakesh=new Employee();
		 Rakesh.details();
	}

}
