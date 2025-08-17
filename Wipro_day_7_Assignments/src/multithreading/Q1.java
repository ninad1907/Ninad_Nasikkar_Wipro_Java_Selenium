/*Write a program to create a thread by extending the Thread class and print numbers from 1 to 5.*/
package multithreading;
class NumberThread extends Thread
{
    public void run()
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println(i);
        }
    }
}

public class Q1
{
    public static void main(String[] args)
    {
        NumberThread t = new NumberThread();
        t.start();
    }
}
