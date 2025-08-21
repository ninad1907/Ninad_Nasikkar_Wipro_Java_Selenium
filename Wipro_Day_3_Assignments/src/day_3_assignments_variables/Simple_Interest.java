package day_3_assignments_variables;
//5. Calculate simple interest 
public class Simple_Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float principal=500000.0f;
		float roi=8.5f;
		int duration=10;
		
		double s_interest=(principal*roi*duration)/100;
		
		System.out.println("Simple Interest = "+s_interest);
	}

}
