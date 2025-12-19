package com.nayeel.imtiaz.patterns.decorator.matcha.v1;

public final class BobaPearls extends CondimentDecorator{
    BobaPearls(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Boba Pearls";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.75;
    }
}
