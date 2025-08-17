/*Division & Array Access
Write a Java class ExceptionDemo with a main method that:
1.	Attempts to divide an integer by zero and access an array out of bounds.
2.	Wrap each risky operation in its own try catch:
o	Catch only the specific exception types: ArithmeticException and ArrayIndexOutOfBoundsException.
o	In each catch, print a user-friendly message.
3.	Add a finally block after each try catch that prints "Operation completed.".
Example structure:
try {
    // division or array access
} catch (ArithmeticException e) {
    System.out.println("Division by zero is not allowed!");
} finally {
    System.out.println("Operation completed.");
}
*/
package exception_handling;

public class Q1
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 0;

        try
        {
            int result = a / b;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Division by zero is not allowed!");
        }
        finally
        {
            System.out.println("Operation completed.\n");
        }

        int[] arr = {1, 2, 3};

        try
        {
            System.out.println("Accessing index 5: " + arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bounds!");
        }
        finally
        {
            System.out.println("Operation completed.");
        }
    }
}

