package multithreading;

//Q12: Using synchronized block to ensure mutual exclusion

class Q12 {
 static int counter = 0;
 static Object lock = new Object();
 public static void main(String[] args) throws InterruptedException {
     Runnable r = () -> {
         for(int i=0;i<1000;i++){
             synchronized(lock){ counter++; }
         }
     };
     Thread t1 = new Thread(r);
     Thread t2 = new Thread(r);
     t1.start();
     t2.start();
     t1.join();
     t2.join();
     System.out.println("Counter: "+counter);
 }
}
