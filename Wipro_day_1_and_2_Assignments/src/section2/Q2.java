package section2;
//Write a Java program to demonstrate the use of if-else and switch-case statements
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if-else
				char alphabet='u';
				if(alphabet=='a'|| alphabet=='e'||alphabet=='i'||alphabet=='o'||alphabet=='u') {
					System.out.println("Vowel");
				}
				else {
					System.out.println("Consonant");
				}
				
				int day=4;
				
				switch(day){
				case 1:
					System.out.println("Monday");
					break;
					
				case 2:
					System.out.println("Tuesday");
					break;
					
				case 3:
					System.out.println("Wednesday");
					break;
					
				case 4:
					System.out.println("Thursday");
					break;
					
				case 5:
					System.out.println("Friday");
					break;
					
				case 6:
					System.out.println("Saturday");
					break;
					
				case 7:
					System.out.println("Sunday");
					break;
				}
	}

}
