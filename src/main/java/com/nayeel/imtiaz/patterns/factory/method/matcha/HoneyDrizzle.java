package com.nayeel.imtiaz.patterns.factory.method.matcha;

public final class HoneyDrizzle extends CondimentDecorator {
    HoneyDrizzle(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Honey Drizzle";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.40;
    }
}
