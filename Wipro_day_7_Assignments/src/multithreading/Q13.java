package multithreading;

//Q13: BankAccount class accessed by multiple threads with synchronization

class Q13 {
 static class BankAccount {
     private int balance = 0;
     synchronized void deposit(int amt)
     {
    	 balance+=amt;
    	}
     synchronized void withdraw(int amt)
     {
    	 balance-=amt;
    	}
     int getBalance(){
    	 return balance; 
    }
 }
 public static void main(String[] args) throws InterruptedException {
     BankAccount account = new BankAccount();
     Runnable r1 = () -> { 
    	 for(int i=0;i<1000;i++) account.deposit(100); 
    };
     Runnable r2 = () -> { 
    	 for(int i=0;i<1000;i++) account.withdraw(50);
    };
     Thread t1 = new Thread(r1);
     Thread t2 = new Thread(r2);
     t1.start(); 
     t2.start();
     t1.join();
     t2.join();
     System.out.println("Final Balance: "+account.getBalance());
 }
}
