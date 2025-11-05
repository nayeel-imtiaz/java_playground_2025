package com.nayeel.imtiaz.patterns.strategy;

interface PaymentStrategy {
    public int pay(double amount);
}

class Card implements PaymentStrategy {
    public int pay(double amount) {
        System.out.println("Card");
        System.out.println(amount);
        return 0;
    }
}

class ApplePay implements PaymentStrategy {
    public int pay(double amount) {
        System.out.println("Apple");
        System.out.println(amount);
        return 1;
    }
}

class Paypal implements PaymentStrategy {
    public int pay(double amount) {
        System.out.println("Paypal");
        System.out.println(amount);
        return 2;
    }
}

class Checkout {
    final private PaymentStrategy payment;

    public Checkout(PaymentStrategy payment) {
        this.payment = payment;
    }

    public void pay(double amount) {
        this.payment.pay(amount);
    }
}

public class PaymentSystem_11_4_25 {
    public static void main(String[] args) {
        Checkout checkout = new Checkout(new Card());
        checkout.pay(5);

        Checkout checkout2 = new Checkout(new ApplePay());
        checkout2.pay(30);

        Checkout checkout3 = new Checkout(new Paypal());
        checkout3.pay(50);
    }
}