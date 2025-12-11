package com.nayeel.imtiaz.patterns.strategy.payment.system.v2;

public class PaymentSystem {
    private PaymentMethod paymentMethod;

    public PaymentSystem(PaymentType paymentType) {
        paymentMethod = PaymentFactory.paymentMethod(paymentType);
    }

    public void changePaymentMethod(PaymentType paymentType) {
        paymentMethod = PaymentFactory.paymentMethod(paymentType);
    }

    public void makeTransaction(int cents) {
        paymentMethod.makeTransaction(cents);
    }
}
