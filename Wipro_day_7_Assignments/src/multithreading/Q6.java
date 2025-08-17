package multithreading;

//Q6: Two threads print even and odd numbers respectively

class Q6 {
 public static void main(String[] args) {
     Runnable even = () -> {
         for(int i=2;i<=10;i+=2) System.out.println("Even: "+i);
     };
     Runnable odd = () -> {
         for(int i=1;i<=9;i+=2) System.out.println("Odd: "+i);
     };
     new Thread(even).start();
     new Thread(odd).start();
 }
}

