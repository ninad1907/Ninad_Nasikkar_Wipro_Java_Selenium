package multithreading;

//Q15: One thread prints A-Z, another 1-26 alternately

class Q15 {
 public static void main(String[] args) {
     Object lock = new Object();
     Thread t1 = new Thread(() -> {
         for(char c='A';c<='Z';c++){
             synchronized(lock){
                 System.out.print(c);
                 lock.notify();
                 try { lock.wait(); } catch(Exception e){}
             }
         }
         synchronized(lock){ lock.notify(); }
     });
     Thread t2 = new Thread(() -> {
         for(int i=1;i<=26;i++){
             synchronized(lock){
                 System.out.print(i);
                 lock.notify();
                 try { lock.wait(); } catch(Exception e){}
             }
         }
         synchronized(lock){ lock.notify(); }
     });
     t1.start();
     t2.start();
 }
}
