package com.nayeel.imtiaz.patterns.decorator.matcha;

public final class CeremonialMatcha implements Beverage {
    @Override
    public String getDescription() {
        return "Ceremonial Matcha";
    }

    @Override
    public double cost() {
        return 5.00;
    }
}
