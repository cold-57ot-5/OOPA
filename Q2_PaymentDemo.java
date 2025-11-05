// File: Q2_PaymentDemo.java
interface Payment {
    void processPayment(double amount);
    void refundPayment(double amount);
}

class CreditCardPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " via Credit Card...");
    }
    public void refundPayment(double amount) {
        System.out.println("Refunding ₹" + amount + " via Credit Card...");
    }
}

class UPIPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing ₹" + amount + " via UPI...");
    }
    public void refundPayment(double amount) {
        System.out.println("Refunding ₹" + amount + " via UPI...");
    }
}

public class Q2_PaymentDemo {
    public static void main(String[] args) {
        Payment[] payments = { new CreditCardPayment(), new UPIPayment() };
        for (Payment p : payments) {
            p.processPayment(500);
            p.refundPayment(500);
            System.out.println();
        }
    }
}
