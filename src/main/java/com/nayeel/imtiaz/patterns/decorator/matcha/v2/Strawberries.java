package com.nayeel.imtiaz.patterns.decorator.matcha.v2;

public class Strawberries extends CondimentDecorator {
    Strawberries(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", strawberries";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.50;
    }
}
