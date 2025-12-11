package com.nayeel.imtiaz.patterns.strategy.payment.system.v2.app;

import com.nayeel.imtiaz.patterns.strategy.payment.system.v2.PaymentSystem;
import com.nayeel.imtiaz.patterns.strategy.payment.system.v2.PaymentType;

public class PaymentSystemClient {
    public static void main(String[] args) {
        PaymentSystem mollyTea = new PaymentSystem(PaymentType.APPLEPAY);
        mollyTea.makeTransaction(1495);

        mollyTea.changePaymentMethod(PaymentType.CREDITCARD);
        mollyTea.makeTransaction(799);
        mollyTea.makeTransaction(699);

        mollyTea.changePaymentMethod(PaymentType.PAYPAL);
        mollyTea.makeTransaction(899);
    }
}
