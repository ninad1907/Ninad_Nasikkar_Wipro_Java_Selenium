/*1.	Initialize int x = 5;.
2.	Write two operations:
x = x + 4.5;    // Does this compile? Why or why not?
x += 4.5;       // What happens here?
3.	Print results and explain behavior in comments (implicit narrowing, compile error vs. successful assignment).
________________________________________
*/
package compound_Assignment_Behaviour;

public class Q3
{
    public static void main(String[] args)
    {
        int x = 5;

        // x = x + 4.5;
        // This does NOT compile because x + 4.5 is double and we cannot assign it to int

        x += 4.5;      // This works because += performs implicit cast to int
        System.out.println("x after x += 4.5: " + x);
    }
}
