
package lambda_expressions;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
//2.	Define a functional interface SumCalculator { int sum(int a, int b); } and a lambda expression to sum two integers.
@FunctionalInterface
interface SumCalculator
{
    int sum(int a, int b);
}

public class Lambda
{
    public static void main(String[] args)
    {
        //	Sum of Two Integers
        SumCalculator add = (a, b) -> a + b;
        System.out.println("Sum: " + add.sum(5, 7));

        /*3.	Check If a String Is Empty
Create a lambda (via a functional interface like Predicate<String>) that returns true if a given string is empty.
Predicate<String> isEmpty = s -> s.isEmpty();
*/
        Predicate<String> isEmpty = s -> s.isEmpty();
        System.out.println("Is empty: " + isEmpty.test(""));

//        4.	Filter Even or Odd Numbers 
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.print("Even numbers: ");
        numbers.forEach(n -> {
            if (isEven.test(n))
            {
                System.out.print(n + " ");
            }
        });
        System.out.println();

        System.out.print("Odd numbers: ");
        numbers.forEach(n -> {
            if (!isEven.test(n))
            {
                System.out.print(n + " ");
            }
        });
        System.out.println();


//        5.	 Convert Strings to Uppercase/Lowercase
        List<String> names = Arrays.asList("alice", "bob", "carol");
        names.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.print(s + " "));
        System.out.println();

        // 6.	 Sort Strings by Length or Alphabetically
        List<String> names1 = new ArrayList<>();
        names1.add("alice");
        names1.add("bob");
        names1.add("carol");
        names1.add("dave");

        // Sort by length
        Collections.sort(names1, (s1, s2) -> s1.length() - s2.length());
        System.out.println("Sorted by length: " + names1);

        // Sort alphabetically
        Collections.sort(names1, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted alphabetically: " + names1);


        // Aggregate Operations (Sum, Max, Average) on Double Arrays
        double[] arr = {2.5, 3.7, 1.2, 4.8};

        double sum = 0;
        double max = arr[0];
        double min = arr[0];

        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        double avg = sum / arr.length;

        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + avg);


        // 9.	Calculate Factorial

        IntFunction<Integer> factorial = n -> {
            int result = 1;
            for (int i = 2; i <= n; i++)
            {
                result *= i;
            }
            return result;
        };

        System.out.println("Factorial of 5: " + factorial.apply(5));
        System.out.println("Factorial of 7: " + factorial.apply(7));

    }
}

