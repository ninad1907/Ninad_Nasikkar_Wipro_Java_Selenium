/*4.	Create a class Box with a variable length. Write a method that modifies the value of length by passing the Box object. Show that the original object is modified.*/
package call_by_Reference;

class Box
{
    int length;

    Box(int length)
    {
        this.length = length;
    }
}

public class Q4
{
    public static void main(String[] args)
    {
        Box b = new Box(10);

        System.out.println("Before method call: length = " + b.length);

        modifyBox(b);

        System.out.println("After method call: length = " + b.length);
    }

    static void modifyBox(Box box)
    {
        box.length = 50;
        System.out.println("Inside method: length = " + box.length);
    }
}
