/*Design an interface Bank with methods deposit(), withdraw(), and getBalance().
Implement this in SavingsAccount and CurrentAccount classes.
•	Use inheritance to create a base Account class.
•	Demonstrate method overriding with customized logic for withdrawal (e.g., minimum balance in SavingsAccount).
*/
package combined_questions;

interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class Account implements Bank {
    protected double balance;
    Account(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends Account {
    private final double minBalance = 500;
    SavingsAccount(double balance) {
        super(balance);
    }
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= minBalance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Cannot withdraw. Minimum balance must be maintained.");
        }
    }
}

class CurrentAccount extends Account {
    CurrentAccount(double balance) {
        super(balance);
    }
    @Override
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}

public class Q2 {
    public static void main(String[] args) {
    	SavingsAccount savings = new SavingsAccount(2000);
    	CurrentAccount current = new CurrentAccount(5000);

        savings.deposit(1000);
        savings.withdraw(2300);
        System.out.println("Savings Balance: " + savings.getBalance());

        current.deposit(2000);
        current.withdraw(6000);
        System.out.println("Current Balance: " + current.getBalance());
    }
}
