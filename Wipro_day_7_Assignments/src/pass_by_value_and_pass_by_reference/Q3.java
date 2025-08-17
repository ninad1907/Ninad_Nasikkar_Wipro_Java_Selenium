/*3.	Write a Java program to pass primitive data types to a method and observe whether changes inside the method affect the original variables.
*/
package pass_by_value_and_pass_by_reference;

public class Q3
{
    public static void main(String[] args)
    {
        int num = 10;
        double price = 99.99;
        boolean flag = true;

        System.out.println("Before method call:");
        System.out.println("num = " + num);
        System.out.println("price = " + price);
        System.out.println("flag = " + flag);

        modifyPrimitives(num, price, flag);

        System.out.println("After method call:");
        System.out.println("num = " + num);
        System.out.println("price = " + price);
        System.out.println("flag = " + flag);
    }

    static void modifyPrimitives(int n, double p, boolean f)
    {
        n = 50;
        p = 199.99;
        f = false;

        System.out.println("Inside method:");
        System.out.println("n = " + n);
        System.out.println("p = " + p);
        System.out.println("f = " + f);
    }
}

