package inheritance;

class Hospital1{
	void hasName(String name) {
		System.out.println(name+" Hospital");
	}
}

class Doctor extends Hospital1{
	void doctor_name(String name) {
		System.out.println(name);
	}
	void hasId(int num) {
		System.out.println("Doctor ID :"+num);
	}
}

class Gynac extends Doctor{
	void department(String dept) {
		System.out.println(dept+" department");
	}
}

class Endo extends Doctor{
	void department(String dept) {
		System.out.println(dept+" department");
	}
}

class Cardiac extends Doctor{
	void department(String dept) {
		System.out.println(dept+" department");
	}
}

class Operation extends Cardiac{
	void totCost(int cost) {
		System.out.println("Total operation cost is "+cost);
	}
}

class OPD extends Cardiac{
	void timings(String time) {
		System.out.println("OPD timings :"+time);
	}
}

class Accountant extends Hospital1{
	void name(String n) {
		System.out.println("Accountant : "+n);
	}
}

class Payments extends Accountant{
	void mode_of_payment(String pay) {
		System.out.println("Mode of payment "+pay);
	}
}

class Documentation extends Accountant{
	void type_of_doc(String doc) {
		System.out.println("Accountant has "+doc+" of patient");
	}
}

class Nurse extends Hospital1{
	void nurse_name(String name) {
		System.out.println("Nurse "+name);
	}
	void role(String r) {
		System.out.println("The nurse "+r);
	}
}

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation o1=new Operation();
		o1.hasName("AIIMS");
		o1.doctor_name("Dr. Bryan Henry");
		o1.hasId(101);
		o1.department("Cardio");
		o1.totCost(450000);
		System.out.println("**********");
		Documentation d1=new Documentation();
		d1.name("Prasad V");
		d1.type_of_doc("MedicalBills");
		System.out.println("**********");
		Payments p1=new Payments();
		p1.mode_of_payment("Cheque");
		System.out.println("**********");
		OPD obj=new OPD();
		obj.timings("9 to 5");
		System.out.println("**********");
		Nurse n1=new Nurse();
		n1.nurse_name("Madhurima Iyyer");
		n1.role("assists the doctor");
	}

}
