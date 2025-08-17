/*1.	Write a program to:
o	Read an int value from user input.
o	Assign it to a double (implicit widening) and print both.
o	Read a double, explicitly cast it to int, then to short, and print results—demonstrate truncation or overflow.
*/
package compound_Assignment_Behaviour;

import java.util.Scanner;

public class Q1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int i = sc.nextInt();
        double d1 = i;
        System.out.println("Integer: " + i);
        System.out.println("Double: " + d1);

        System.out.print("Enter a double: ");
        double d2 = sc.nextDouble();
        int i2 = (int) d2;
        short s2 = (short) i2;
        System.out.println("Double: " + d2);
        System.out.println("Int: " + i2);
        System.out.println("Short: " + s2);

    }
}
