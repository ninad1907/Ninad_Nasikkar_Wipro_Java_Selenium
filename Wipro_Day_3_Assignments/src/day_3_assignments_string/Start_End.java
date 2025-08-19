package day_3_assignments_string;
//5. Check if String  starts with “j” and end 	with “a” . eg. “java”
public class Start_End {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java";
		
		str=str.toLowerCase();
		
		if(str.startsWith("j") && str.endsWith("a")) {
			System.out.println("String starts with 'j' and ends with 'a'");
		}
		else {
			System.out.println("String does not start with 'j' and ends with 'a'");
		}
	}

}
