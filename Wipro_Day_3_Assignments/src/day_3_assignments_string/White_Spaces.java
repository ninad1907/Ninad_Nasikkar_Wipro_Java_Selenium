package day_3_assignments_string;
//Write a program to remove all white Spaces from string
public class White_Spaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java   is  fun";
        String noSpaces = str.replaceAll("\\s+", "");
        System.out.println(noSpaces);
	}

}
