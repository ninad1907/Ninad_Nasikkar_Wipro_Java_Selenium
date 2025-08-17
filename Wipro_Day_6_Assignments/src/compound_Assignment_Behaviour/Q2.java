/*2.	Convert an int to String using String.valueOf(...), then back with Integer.parseInt(...). Handle NumberFormatException.*/
package compound_Assignment_Behaviour;

import java.util.Scanner;

public class Q2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        String str = String.valueOf(num);
        System.out.println("String: " + str);

        try
        {
            int parsed = Integer.parseInt(str);
            System.out.println("Parsed int: " + parsed);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Invalid number!");
        }
    }
}

