/*create multilevel inheritance for
//Vehicle
//Four_wheeler
//Petrol_Four_Wheeler
//FiveSeater_Petrol_Four_Wheeler
//Baleno_FiveSeater_Petrol_Four_Wheeler
*/
package inheritance;

class Vehicle{
	void start() {
		System.out.println("Vehicle starts");
	}
	
	void stop() {
		System.out.println("Vehicle stops");
	}
}

class Four_Wheeler extends Vehicle{
	void brand(String company) {
		System.out.println("Company = "+company);
	}
}

class Petrol_Four_Wheeler extends Four_Wheeler{
	void engine_type(String type) {
		System.out.println("Type = "+type);
	}
}

class FiveSeater_Petrol_Four_Wheeler extends Petrol_Four_Wheeler{
	void seats(int tot_seats) {
		System.out.println("Total seats = "+tot_seats);
	}
}

class Baleno_FiveSeater_Petrol_Four_Wheeler extends FiveSeater_Petrol_Four_Wheeler{
	void color(String car_color) {
		System.out.println("Car colour = "+car_color);
	}
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baleno_FiveSeater_Petrol_Four_Wheeler obj=new Baleno_FiveSeater_Petrol_Four_Wheeler();
		obj.start();
		obj.stop();
		obj.brand("Maruti Suzuki");
		obj.engine_type("1.2 Litre petrol");
		obj.seats(5);
		obj.color("Royal blue");
	}

}
