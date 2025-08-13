/*. Advanced: Bank Account with Deposit/Withdraw Logic
Transaction validation and encapsulation protection.
•	Create a BankAccount class with private accountNumber, accountHolder, balance.
•	Provide:
o	deposit(double amount) — ignores or rejects negative.
o	withdraw(double amount) — prevents overdraft and returns a boolean success.
o	Getter for balance but no setter.
•	Optionally override toString() to display masked account number and details.
•	Track transaction history internally using a private list (or inner class for transaction object).
•	Expose a method getLastTransaction() but do not expose the full internal list.
*/
package encapsulation;

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private Transaction lastTransaction;

    private class Transaction {
        String type;
        double amount;
        Transaction(String type, double amount) {
            this.type = type;
            this.amount = amount;
        }
        @Override
        public String toString() {
            return type + ": " + amount;
        }
    }

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Invalid initial balance. Setting to 0.");
            this.balance = 0;
        }
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            lastTransaction = new Transaction("Deposit", amount);
            System.out.println("Deposited: " + amount);
            return true;
        }
        System.out.println("Deposit failed. Amount must be positive.");
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            lastTransaction = new Transaction("Withdrawal", amount);
            System.out.println("Withdrew: " + amount);
            return true;
        }
        System.out.println("Withdrawal failed. Insufficient funds or invalid amount.");
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public String getLastTransaction() {
        if (lastTransaction == null) {
            return "No transactions yet.";
        }
        return lastTransaction.toString();
    }

    @Override
    public String toString() {
        String maskedAcc = accountNumber.substring(0, 2) + "****" + accountNumber.substring(accountNumber.length() - 2);
        return "Account Holder: " + accountHolder + "\n" +
               "Account Number: " + maskedAcc + "\n" +
               "Balance: " + balance;
    }
}

public class Q3 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("1234567890", "Alice Johnson", 5000);

        System.out.println(acc);
        System.out.println();

        acc.deposit(1500);
        acc.withdraw(2000);
        acc.withdraw(6000);

        System.out.println("\nLast Transaction: " + acc.getLastTransaction());
        System.out.println("\nFinal Account Info:\n" + acc);
    }
}

