package com.nayeel.imtiaz.patterns.strategy.payment.system.v2;

class PayPal implements PaymentMethod{
    public void makeTransaction(int cents) {
        System.out.println(
            "Pay "
            + cents
            + " cents using PayPal\n"
        );
    }
}
