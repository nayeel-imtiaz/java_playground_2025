package com.nayeel.imtiaz.patterns.strategy.payment.system.v2;

public class PaymentFactory {
    public static PaymentMethod paymentMethod(PaymentType paymentType) {
        return switch (paymentType) {
            case APPLEPAY -> new ApplePay();
            case CREDITCARD -> new CreditCard();
            case PAYPAL -> new PayPal();
        };
    }
}
