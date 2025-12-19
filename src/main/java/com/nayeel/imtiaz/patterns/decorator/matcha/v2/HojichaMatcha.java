package com.nayeel.imtiaz.patterns.decorator.matcha.v2;

public final class HojichaMatcha implements Beverage {
    HojichaMatcha() {}

    @Override
    public String getDescription() {
        return "Hojicha Matcha";
    }

    @Override
    public double getCost() {
        return 6.00;
    }
}
