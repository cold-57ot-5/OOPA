abstract class BankAccount {
    private int accountNumber;
    protected double balance;

    BankAccount(int accNo, double balance) {
        this.accountNumber = accNo;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    abstract void calculateInterest();

    void displayBalance() {
        System.out.println("Account No: " + accountNumber + ", Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int accNo, double balance) {
        super(accNo, balance);
    }

    void calculateInterest() {
        double interest = balance * 0.04; // 4% interest
        System.out.println("Interest for Savings Account: ₹" + interest);
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(int accNo, double balance) {
        super(accNo, balance);
    }

    void calculateInterest() {
        System.out.println("No interest for Current Account.");
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount s = new SavingsAccount(1001, 5000);
        s.deposit(2000);
        s.calculateInterest();
        s.displayBalance();

        BankAccount c = new CurrentAccount(1002, 10000);
        c.withdraw(3000);
        c.calculateInterest();
        c.displayBalance();
    }
}
