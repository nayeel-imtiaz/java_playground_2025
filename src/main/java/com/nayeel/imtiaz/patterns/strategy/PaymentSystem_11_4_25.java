package com.nayeel.imtiaz.patterns.strategy;

import java.util.Objects;

interface PaymentStrategy {
    void pay(long cents);
}

final class Card implements PaymentStrategy {
    @Override public void pay(long cents) {
        System.out.println("Card");
        System.out.println(cents);
    }
}

final class ApplePay implements PaymentStrategy {
    @Override public void pay(long cents) {
        System.out.println("Apple");
        System.out.println(cents);
    }
}

final class PayPal implements PaymentStrategy {
    @Override public void pay(long cents) {
        System.out.println("Paypal");
        System.out.println(cents);
    }
}

final class Checkout {
    private PaymentStrategy payment;

    public Checkout(PaymentStrategy payment) {
        this.payment = Objects.requireNonNull(payment);
    }

    public void setPaymentStrategy(PaymentStrategy payment) {
        this.payment = Objects.requireNonNull(payment);
    }

    public void pay(long cents) {
        this.payment.pay(cents);
    }
}

public class PaymentSystem_11_4_25 {
    public static void main(String[] args) {
        Checkout checkout = new Checkout(new Card());
        checkout.pay(5);

        checkout.setPaymentStrategy(new ApplePay());
        checkout.pay(10);

        checkout.setPaymentStrategy(new PayPal());
        checkout.pay(15);

        // checkout.setPaymentStrategy(null); // Throws null pointer exception
    }
}