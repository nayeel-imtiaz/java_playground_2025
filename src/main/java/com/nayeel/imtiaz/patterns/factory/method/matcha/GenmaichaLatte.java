package com.nayeel.imtiaz.patterns.factory.method.matcha;

public final class GenmaichaLatte implements Beverage {
    GenmaichaLatte() {}

    @Override
    public String getDescription() {
        return "Genmaicha Latte";
    }

    @Override
    public double cost() {
        return 4.75;
    }
}
