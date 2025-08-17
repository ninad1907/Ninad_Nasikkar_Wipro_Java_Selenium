package multithreading;

//Q11: Solve race condition using synchronized keyword

class Q11 {
 static int counter = 0;
 static synchronized void increment() { counter++; }
 public static void main(String[] args) throws InterruptedException {
     Runnable r = () -> {
         for(int i=0;i<1000;i++) increment();
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

