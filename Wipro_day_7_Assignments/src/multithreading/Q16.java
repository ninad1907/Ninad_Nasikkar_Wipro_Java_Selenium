package multithreading;

//Q16: Demonstrate Thread.isAlive()

class Q16 {
 public static void main(String[] args) throws InterruptedException {
     Thread t = new Thread(() -> { for(int i=0;i<5;i++) System.out.println("Running"); });
     System.out.println("Before start: "+t.isAlive());
     t.start();
     System.out.println("After start: "+t.isAlive());
     t.join();
     System.out.println("After join: "+t.isAlive());
 }
}
