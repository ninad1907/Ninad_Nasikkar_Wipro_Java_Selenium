package day_3_assignments_variables;

//1. Create one employee class and in that class create instance variable, local variable and static variable.
public class Employee {
	String name;
	int age;
	int empid;
	int salary;
	static String companyname="Wipro";
	
	void details(String name1,int age1,int empid1,int salary1) {
		name=name1;
		age=age1;
		empid=empid1;
		salary=salary1;
		
		System.out.println("Name ="+name);
		System.out.println("Employee ID ="+empid);
		System.out.println("Age ="+age);
		System.out.println("Salary ="+salary);
		System.out.println("Comapny Name ="+companyname);
	}
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Employee emp=new Employee();
			emp.details("Ajit Mishra", 32, 777, 50000);
			System.out.println();
			emp.details("Sumit Yadav", 35, 778, 70000);
			System.out.println();
			emp.details("Kunal Shah", 37, 779, 90000);
	}

}
