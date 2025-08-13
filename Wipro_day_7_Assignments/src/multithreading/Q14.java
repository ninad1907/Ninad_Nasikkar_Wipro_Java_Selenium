package multithreading;

//Q14: Producer-Consumer using wait() and notify()

class Q14 {
 static class Q {
     int n; boolean valueSet = false;
     synchronized void put(int n) throws InterruptedException {
         while(valueSet) wait();
         this.n = n;
         valueSet = true;
         notify();
     }
     synchronized int get() throws InterruptedException {
         while(!valueSet) wait();
         valueSet = false;
         notify();
         return n;
     }
 }
 public static void main(String[] args) {
     Q q = new Q();
     Thread producer = new Thread(() -> {
         for(int i=1;i<=5;i++){
             try { q.put(i); System.out.println("Produced "+i); } catch(Exception e){}
         }
     });
     Thread consumer = new Thread(() -> {
         for(int i=1;i<=5;i++){
             try { System.out.println("Consumed "+q.get()); } catch(Exception e){}
         }
     });
     producer.start();
     consumer.start();
 }
}

