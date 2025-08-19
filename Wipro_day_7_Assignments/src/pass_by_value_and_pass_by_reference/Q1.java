/*1.	Write a program where a method accepts an integer parameter and tries to change its value. Print the value before and after the method call.*/
package pass_by_value_and_pass_by_reference;

public class Q1
{
    public static void main(String[] args)
    {
        int number = 10;
        System.out.println("Before method call: " + number);

        changeValue(number);

        System.out.println("After method call: " + number);
    }

    static void changeValue(int n)
    {
        n = 50;
        System.out.println("Inside method, value changed to: " + n);
    }
}
