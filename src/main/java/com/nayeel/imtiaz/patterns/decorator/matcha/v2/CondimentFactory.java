package com.nayeel.imtiaz.patterns.decorator.matcha.v2;

public class CondimentFactory {
    private CondimentFactory() {}

    public static Beverage addCondiment(Condiments condiment, Beverage beverage) {
        return switch(condiment) {
            case BOBAPEARLS -> new BobaPearls(beverage);
            case MATCHACREAM -> new MatchaCream(beverage);
            case PEACANS -> new Peacans(beverage);
            case STRAWBERRIES -> new Strawberries(beverage);
        };
    }
}
