/*3.	Create Hospital super class and access this class inside the patient child class and access properties from Hospital class.*/
package inheritance;

class Hospital {
    String name;
    String location;
    int totalBeds;

    Hospital(String name, String location, int totalBeds) {
        this.name = name;
        this.location = location;
        this.totalBeds = totalBeds;
    }
}

class Patient extends Hospital {
    String patientName;
    int age;

    Patient(String hospitalName, String hospitalLocation, int totalBeds, String patientName, int age) {
        super(hospitalName, hospitalLocation, totalBeds);
        this.patientName = patientName;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Hospital: " + name + ", Location: " + location + ", Beds: " + totalBeds);
        System.out.println("Patient Name: " + patientName + ", Age: " + age);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Patient p = new Patient("City Hospital", "Pune", 150, "Yash", 22);
        p.displayInfo();
    }
}

