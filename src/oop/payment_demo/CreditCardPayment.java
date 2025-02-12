package oop.payment_demo;

public class CreditCardPayment extends Payment {

    private String cardNumber;
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount + "...");
        System.out.println("Payment successful. Card number: " + cardNumber);

    }
}
