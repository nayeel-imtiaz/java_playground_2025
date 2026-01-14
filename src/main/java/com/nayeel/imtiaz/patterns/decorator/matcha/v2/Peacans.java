package com.nayeel.imtiaz.patterns.decorator.matcha.v2;

public final class Peacans extends CondimentDecorator {
    Peacans(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", pecans";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.50;
    }
}
