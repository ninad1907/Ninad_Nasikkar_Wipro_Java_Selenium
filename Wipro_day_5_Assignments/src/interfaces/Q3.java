/*. Contract Programming: Printer Switch
•	Declare an interface Printer with method void print(String document).
•	Implement two classes: LaserPrinter and InkjetPrinter, each providing unique behavior.
•	In the client code, declare Printer p;, switch implementations at runtime, and test printing.
*/
package interfaces;

interface Printer
{
    void print(String document);
}

class LaserPrinter implements Printer
{
    public void print(String document)
    {
        System.out.println("Laser printing: " + document);
    }
}

class InkjetPrinter implements Printer
{
    public void print(String document)
    {
        System.out.println("Inkjet printing: " + document);
    }
}

public class Q3
{
    public static void main(String[] args)
    {
        Printer p;

        p = new LaserPrinter();
        p.print("Hello World");

        p = new InkjetPrinter();
        p.print("Design Patterns");
    }
}
