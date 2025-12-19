package com.nayeel.imtiaz.patterns.decorator.matcha.v1;

public final class HojichaLatte implements Beverage {
    HojichaLatte() {}

    @Override
    public String getDescription() {
        return "Hojicha Matcha";
    }

    @Override
    public double cost() {
        return 4.50;
    }
}
