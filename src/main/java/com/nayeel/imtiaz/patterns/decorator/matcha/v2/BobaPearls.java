package com.nayeel.imtiaz.patterns.decorator.matcha.v2;

public class BobaPearls extends CondimentDecorator {
    BobaPearls(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", boba pearls";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.50;
    }
}
