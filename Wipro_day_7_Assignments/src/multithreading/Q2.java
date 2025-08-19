/*Create a thread by implementing the Runnable interface that prints the current thread name.*/
package multithreading;
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Current Thread: " + Thread.currentThread().getName());
    }
}

public class Q2{
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "Thread-A");
        Thread t2 = new Thread(new MyRunnable(), "Thread-B");

        t1.start();
        t2.start();
    }
}
