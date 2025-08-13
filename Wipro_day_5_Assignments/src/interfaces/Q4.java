/*. Extended Interface Hierarchy

•	Define interface BaseVehicle with method void start().
•	Define interface AdvancedVehicle that extends BaseVehicle, adding method void stop() and boolean refuel(int amount).
•	Implement Car to satisfy both interfaces; include a constructor initializing fuel level.
•	In Main, manipulate the object via both interface types.
*/
package interfaces;

interface BaseVehicle
{
    void start();
}

interface AdvancedVehicle extends BaseVehicle
{
    void stop();
    boolean refuel(int amount);
}

class Car implements AdvancedVehicle
{
    int fuel;

    Car(int fuel)
    {
        this.fuel = fuel;
    }

    public void start()
    {
        if (fuel > 0)
            System.out.println("Car started");
        else
            System.out.println("Cannot start..... no fuel");
    }

    public void stop()
    {
        System.out.println("Car stopped");
    }

    public boolean refuel(int amount)
    {
        if (amount > 0)
        {
            fuel += amount;
            System.out.println("Car refueled..... fuel=" + fuel);
            return true;
        }
        return false;
    }
}

public class Q4
{
    public static void main(String[] args)
    {
        BaseVehicle bv = new Car(0);
        bv.start();

        AdvancedVehicle av = (AdvancedVehicle) bv;
        av.refuel(50);
        av.start();
        av.stop();
    }
}
