package multithreading;

//Q9: Stop a thread using a boolean flag

class Q9 {
 static class MyThread extends Thread {
     volatile boolean running = true;
     public void run() {
         while(running) System.out.println("Thread running");
     }
     void stopThread() { running = false; }
 }
 public static void main(String[] args) throws InterruptedException {
     MyThread t = new MyThread();
     t.start();
     Thread.sleep(1000);
     t.stopThread();
     System.out.println("Thread stopped");
 }
}
