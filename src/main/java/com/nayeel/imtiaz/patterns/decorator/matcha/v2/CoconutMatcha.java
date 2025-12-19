package com.nayeel.imtiaz.patterns.decorator.matcha.v2;

public final class CoconutMatcha implements Beverage {
    CoconutMatcha() {}

    @Override
    public String getDescription() {
        return "Coconut Matcha";
    }

    @Override
    public double getCost() {
        return 5.00;
    }
}
