/*Calculator Operations Enum
Create enum Operation (PLUS, MINUS, TIMES, DIVIDE) with an eval(double a, double b) method.
Implement two versions:
•	One using a switch(this) inside eval.
•	Another using constant-specific method overrides for eval.
Compare both designs.
________________________________________
*/
package enums;

enum OperationSwitch
{
    PLUS,
    MINUS,
    TIMES,
    DIVIDE;

    double eval(double a, double b)
    {
        switch(this)
        {
            case PLUS:
                return a + b;
            case MINUS:
                return a - b;
            case TIMES:
                return a * b;
            case DIVIDE:
                return a / b;
            default:
                return 0;
        }
    }
}

enum OperationOverride
{
    PLUS
    {
        double eval(double a, double b) { return a + b; }
    },
    MINUS
    {
        double eval(double a, double b) { return a - b; }
    },
    TIMES
    {
        double eval(double a, double b) { return a * b; }
    },
    DIVIDE
    {
        double eval(double a, double b) { return a / b; }
    };

    abstract double eval(double a, double b);
}

public class Q7
{
    public static void main(String[] args)
    {
        double x = 10;
        double y = 5;

        System.out.println("Using switch:");
        for (OperationSwitch op : OperationSwitch.values())
        {
            System.out.println(op + ": " + op.eval(x, y));
        }

        System.out.println("\nUsing overrides:");
        for (OperationOverride op : OperationOverride.values())
        {
            System.out.println(op + ": " + op.eval(x, y));
        }
    }
}

