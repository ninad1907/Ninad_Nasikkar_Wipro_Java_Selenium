package multithreading;

//Q17: Thread group creation and management

class Q17 {
 public static void main(String[] args) {
     ThreadGroup tg = new ThreadGroup("Group1");
     Runnable r = () -> System.out.println(Thread.currentThread().getName()+" running");
     Thread t1 = new Thread(tg,r,"T1");
     Thread t2 = new Thread(tg,r,"T2");
     t1.start();
     t2.start();
     System.out.println("Active threads in group: "+tg.activeCount());
 }
}

