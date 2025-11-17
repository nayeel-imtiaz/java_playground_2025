package com.nayeel.imtiaz.patterns.decorator.matcha;

public final class OatMilk extends CondimentDecorator {
    OatMilk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Oat Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.50;
    }
}
