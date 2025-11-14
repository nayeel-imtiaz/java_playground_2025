package com.nayeel.imtiaz.patterns.decorator.matcha;

final public class MatchaFoamCream extends CondimentDecorator{
    public MatchaFoamCream(Beverage beverage) {
        this.beverage = beverage;
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
