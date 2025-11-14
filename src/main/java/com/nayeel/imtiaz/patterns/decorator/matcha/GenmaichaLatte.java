package com.nayeel.imtiaz.patterns.decorator.matcha;

final public class GenmaichaLatte implements Beverage{
    @Override
    public String getDescription() {
        return "Genmaicha Latte";
    }

    @Override
    public double cost() {
        return 4.75;
    }
}
