package multithreading;

//Q5: Create a thread and use Thread.yield() to give chance to another thread

class Q5 {
 public static void main(String[] args) {
     Runnable r1 = () -> {
         for(int i=0;i<5;i++){
             System.out.println("Thread 1");
             Thread.yield();
         }
     };
     Runnable r2 = () -> {
         for(int i=0;i<5;i++) System.out.println("Thread 2");
     };
     new Thread(r1).start();
     new Thread(r2).start();
 }
}
