package com.nayeel.imtiaz.patterns.decorator.matcha.v2;

public class Peacans extends CondimentDecorator {
    Peacans(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", peacans";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.50;
    }
}
