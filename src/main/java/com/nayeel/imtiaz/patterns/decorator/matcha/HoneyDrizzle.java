package com.nayeel.imtiaz.patterns.decorator.matcha;

public final class HoneyDrizzle extends CondimentDecorator {
    public HoneyDrizzle(Beverage beverage) {
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
