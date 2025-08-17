/*Days of the Week
Define an enum DaysOfWeek with seven constants. Then in main(), prompt the user to input a day name and:
•	Print its position via ordinal().
•	Confirm if it's a weekend day using a switch or if-statement.
*/
package enums;

import java.util.Scanner;

enum DaysOfWeek
{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class Q1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day name: ");
        String input = sc.nextLine().toUpperCase();

        try
        {
            DaysOfWeek day = DaysOfWeek.valueOf(input);
            System.out.println("Position in week: " + day.ordinal());

            switch(day)
            {
                case SATURDAY:
                case SUNDAY:
                    System.out.println("It's a weekend!");
                    break;
                default:
                    System.out.println("It's a weekday.");
            }
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Enter correct day.");
        }

        sc.close();
    }
}
