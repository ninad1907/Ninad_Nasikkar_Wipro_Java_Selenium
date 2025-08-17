//Q3: Create two threads, each printing a different message 5 times.
package multithreading;


class Q3 {
 public static void main(String[] args) {
     Runnable r1 = () -> {
         for(int i=0;i<5;i++) System.out.println("Message from Thread 1");
     };
     Runnable r2 = () -> {
         for(int i=0;i<5;i++) System.out.println("Message from Thread 2");
     };
     new Thread(r1).start();
     new Thread(r2).start();
 }
}
