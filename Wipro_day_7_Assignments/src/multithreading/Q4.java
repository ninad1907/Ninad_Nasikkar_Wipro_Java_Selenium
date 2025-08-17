package multithreading;

//Q4: Demonstrate Thread.sleep() by pausing execution between numbers 1 to 3

class Q4 {
 public static void main(String[] args) throws InterruptedException {
     for(int i=1;i<=3;i++){
         System.out.println(i);
         Thread.sleep(1000);
     }
 }
}
