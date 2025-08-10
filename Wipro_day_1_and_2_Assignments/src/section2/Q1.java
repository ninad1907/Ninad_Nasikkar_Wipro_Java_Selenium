package section2;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//decision making statements
		
		//if
		int age=19;
		if(age>18) {
			System.out.println("You are eligible to vote");
		}
		
		//if-else
		char alphabet='u';
		if(alphabet=='a'|| alphabet=='e'||alphabet=='i'||alphabet=='o'||alphabet=='u') {
			System.out.println("Vowel");
		}
		else {
			System.out.println("Consonant");
		}
		
		//if else-if else
		float marks=98.4f;
		if(marks>=90) {
			System.out.println("Grade A");
		}
		else if(marks>=80 && marks<90){
			System.out.println("Grade B");
		}
		else if(marks>=70 && marks<80){
			System.out.println("Grade C");
		}
		else if(marks>35 && marks<70){
			System.out.println("Grade D");
		}
		else {
			System.out.println("Fail");
		}
		
		//switch
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
		
		System.out.println("**********************************************");
		
		//looping statements
		
		//for
		
		for(char i='a';i<='f';i++) {
			System.out.println(i);
		}
		
		//while
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		//do while
		int j=1;
		do{
			System.out.println("Hello");
			j++;
		}
		while(j<=6);
		
		System.out.println("**********************************************");
		
		//jump statements
		
		for(int k=1;k<10;k++) {
			if(k==4)
				break;
			System.out.println(k);
	
		}
		
		for(int k=1;k<10;k++) {
			if(k==4)
				continue;
			System.out.println(k);
			
		}
	}

}
