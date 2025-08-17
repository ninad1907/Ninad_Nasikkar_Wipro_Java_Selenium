/*Mini Project – Temperature Converter 
1.	Prompt user for a temperature in Celsius (double).
2.	Convert it to Fahrenheit:
double fahrenheit = celsius * 9/5 + 32;
3.	Then cast that fahrenheit to int for display.
4.	Print both the precise (double) and truncated (int) values, and comment on precision loss.
*/
package mini_project;

import java.util.Scanner;

public class TempConverter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = celsius * 9 / 5 + 32;
        int truncatedF = (int) fahrenheit;

        System.out.println("Temperature in Fahrenheit (precise): " + fahrenheit);
        System.out.println("Temperature in Fahrenheit (truncated to int): " + truncatedF);

        sc.close();
    }
}

