//2.	Demonstrate the use of the super keyword
package inheritance;

class Software_Testing{
	void syllabus() {
		System.out.println("Software testing course details");
		System.out.println("Manual testing, core java, selenium webdriver, Jira(project management), Mysql(database)");
		System.out.println("Fees:" +50000);
	}
}

class Manual extends Software_Testing{
	void manual_test() {
		super.syllabus();
		System.out.println("If it is manual testing only \nthen it includes manual testing concepts, jira, postman, mysql and fees is 30000");
	}
}

class Automation extends Software_Testing{
	void automation_test() {
		super.syllabus();
		System.out.println("If it is automation testing only \nthen it includes automation testing concepts, core java, selenium webdriver and fees is 20000");
	}
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manual mn=new Manual();
//		mn.syllabus();
		mn.manual_test();
		System.out.println("*********");
		Automation at=new Automation();
		at.automation_test();
	}

}

