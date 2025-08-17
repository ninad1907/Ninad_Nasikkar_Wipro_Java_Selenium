/*2.	Create a method that takes two integer values and swaps them. Show that the original values remain unchanged after the method call.*/
package pass_by_value_and_pass_by_reference;

public class Q2
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 10;

        System.out.println("Before swap method: a = " + a + ", b = " + b);

        swap(a, b);

        System.out.println("After swap method: a = " + a + ", b = " + b);
    }

    static void swap(int x, int y)
    {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Inside swap method: x = " + x + ", y = " + y);
    }
}
