package com.nayeel.imtiaz.patterns.decorator.matcha.v2;

public class MatchaCream extends CondimentDecorator {
    MatchaCream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", matcha cream";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.50;
    }
}
