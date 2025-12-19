package com.nayeel.imtiaz.patterns.decorator.matcha.v1;

public final class CeremonialMatcha implements Beverage {
    CeremonialMatcha(){}

    @Override
    public String getDescription() {
        return "Ceremonial Matcha";
    }

    @Override
    public double cost() {
        return 5.00;
    }
}
