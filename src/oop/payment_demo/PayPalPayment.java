package oop.payment_demo;

public class PayPalPayment extends Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount + "...");
        System.out.println("Payment successful.");
    }

}
