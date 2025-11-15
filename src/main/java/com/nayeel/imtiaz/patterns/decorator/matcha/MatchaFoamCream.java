package com.nayeel.imtiaz.patterns.decorator.matcha;

public final class MatchaFoamCream extends CondimentDecorator{
    public MatchaFoamCream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Matcha Foam Cream";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.80;
    }
}
