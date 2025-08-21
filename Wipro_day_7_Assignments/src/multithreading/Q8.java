package multithreading;

//Q8: Demonstrate Thread.join() – wait for a thread to finish before proceeding

class Q8 {
 public static void main(String[] args) throws InterruptedException {
     Thread t = new Thread(() -> {
         for(int i=1;i<=5;i++) System.out.println("Thread running: "+i);
     });
     t.start();
     t.join();
     System.out.println("Main thread resumes after t finishes");
 }
}

