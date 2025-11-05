public class Bank {
    // Static members
    static String bankName;
    static double interestRate;

    // Instance members
    int accountNumber;
    String holderName;
    double balance;

    // Static block
    static {
        bankName = "BrightBank";
        interestRate = 3.5;
        System.out.println("Static block executed: Bank data initialized.");
    }

    // Constructor
    Bank(int accNo, String name, double bal) {
        accountNumber = accNo;
        holderName = name;
        balance = bal;
    }

    // Static method to change interest rate
    static void updateInterest(double newRate) {
        interestRate = newRate;
        System.out.println("Interest rate updated to " + interestRate + "%");
    }

    // Instance method to display details
    void displayDetails() {
        System.out.println("Account No: " + accountNumber + ", Name: " + holderName +
                           ", Balance: " + balance + ", Bank: " + bankName +
                           ", Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {
        Bank b1 = new Bank(1001, "Maeve", 25000);
        Bank b2 = new Bank(1002, "Nilric", 50000);

        b1.displayDetails();
        b2.displayDetails();

        Bank.updateInterest(4.0); // Static method affects all objects

        System.out.println("\nAfter updating interest rate:");
        b1.displayDetails();
        b2.displayDetails();
    }
}
