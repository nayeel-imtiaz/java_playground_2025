package com.nayeel.imtiaz.patterns.decorator.matcha.v2;

public class CeremonialMatcha implements Beverage{
    CeremonialMatcha() {}

    @Override
    public String getDescription() {
        return "Ceremonial Matcha";
    }

    @Override
    public double getCost() {
        return 8.00;
    }
}
