package com.nayeel.imtiaz.patterns.decorator.matcha.v1;

public abstract class CondimentDecorator implements Beverage {
    protected final Beverage beverage;

    protected CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
