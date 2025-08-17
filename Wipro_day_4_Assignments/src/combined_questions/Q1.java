/*Create an abstract class SmartDevice with methods like turnOn(), turnOff(), and performFunction().
Create child classes:
•	SmartPhone: performs calling and browsing.
•	SmartWatch: tracks fitness and time.
•	SmartSpeaker: plays music and responds to voice commands.
*/
package combined_questions;

abstract class SmartDevice {
    abstract void turnOn();
    abstract void turnOff();
    abstract void performFunction();
}

class SmartPhone extends SmartDevice {
    void turnOn() {
        System.out.println("SmartPhone turned on");
    }
    void turnOff() {
        System.out.println("SmartPhone turned off");
    }
    void performFunction() {
        System.out.println("SmartPhone is calling and browsing");
    }
}

class SmartWatch extends SmartDevice {
    void turnOn() {
        System.out.println("SmartWatch turned on");
    }
    void turnOff() {
        System.out.println("SmartWatch turned off");
    }
    void performFunction() {
        System.out.println("SmartWatch is tracking fitness and showing time");
    }
}

class SmartSpeaker extends SmartDevice {
    void turnOn() {
        System.out.println("SmartSpeaker turned on");
    }
    void turnOff() {
        System.out.println("SmartSpeaker turned off");
    }
    void performFunction() {
        System.out.println("SmartSpeaker is playing music and responding to voice commands");
    }
}

public class Q1 {
    public static void main(String[] args) {
        SmartPhone motorola = new SmartPhone();
        SmartWatch boat = new SmartWatch();
        SmartSpeaker harman = new SmartSpeaker();

        motorola.turnOn();
        motorola.performFunction();
        motorola.turnOff();

        boat.turnOn();
        boat.performFunction();
        boat.turnOff();

        harman.turnOn();
        harman.performFunction();
        harman.turnOff();
    }
}
