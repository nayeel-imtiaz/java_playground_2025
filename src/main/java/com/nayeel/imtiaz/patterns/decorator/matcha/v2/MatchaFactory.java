package com.nayeel.imtiaz.patterns.decorator.matcha.v2;

public class MatchaFactory {
    private MatchaFactory() {}

    public static Beverage addBase(BaseDrinks baseDrink) {
        return switch(baseDrink) {
            case CEREMONIALMATCHA -> new CeremonialMatcha();
            case HOJICHAMATCHA -> new HojichaMatcha();
            case COCONUTMATCHA -> new CoconutMatcha();
        };
    }
}
