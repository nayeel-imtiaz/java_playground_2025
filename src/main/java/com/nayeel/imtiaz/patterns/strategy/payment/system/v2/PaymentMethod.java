package com.nayeel.imtiaz.patterns.strategy.payment.system.v2;

public interface PaymentMethod {
    public void makeTransaction(int cents);
}
