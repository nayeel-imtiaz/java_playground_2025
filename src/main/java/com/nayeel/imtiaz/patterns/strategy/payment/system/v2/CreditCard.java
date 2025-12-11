package com.nayeel.imtiaz.patterns.strategy.payment.system.v2;

class CreditCard implements PaymentMethod {
    public void makeTransaction(int cents) {
        System.out.println(
            "Pay "
            + cents
            + " cents with credit card\n"
        );
    }
}
