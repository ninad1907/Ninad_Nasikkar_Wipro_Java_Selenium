package multithreading;

//Q10: Multiple threads access a shared counter without synchronization (race condition)

class Q10 {
 static int counter = 0;
 public static void main(String[] args) {
     Runnable r = () -> {
         for(int i=0;i<1000;i++) counter++;
     };
     Thread t1 = new Thread(r);
     Thread t2 = new Thread(r);
     t1.start();
     t2.start();
     try { t1.join(); t2.join(); } catch(Exception e){}
     System.out.println("Counter: "+counter);
 }
}
