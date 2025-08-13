package multithreading;

//Q7: Start three threads and set different priorities

class Q7 {
 public static void main(String[] args) {
     Runnable r = () -> {
         System.out.println(Thread.currentThread().getName() + " running");
     };
     Thread t1 = new Thread(r,"T1");
     Thread t2 = new Thread(r,"T2");
     Thread t3 = new Thread(r,"T3");
     t1.setPriority(Thread.MIN_PRIORITY);
     t2.setPriority(Thread.NORM_PRIORITY);
     t3.setPriority(Thread.MAX_PRIORITY);
     t1.start();
     t2.start();
     t3.start();
 }
}
