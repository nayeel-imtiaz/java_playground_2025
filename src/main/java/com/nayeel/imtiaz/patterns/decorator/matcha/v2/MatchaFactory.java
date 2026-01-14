package com.nayeel.imtiaz.patterns.decorator.matcha.v2;

public class MatchaFactory {
    private MatchaFactory() {}

    public static Beverage addBase(BaseDrink baseDrink) {
        return switch(baseDrink) {
            case CEREMONIAL_MATCHA -> new CeremonialMatcha();
            case HOJICHA_MATCHA -> new HojichaMatcha();
            case COCONUT_MATCHA -> new CoconutMatcha();
        };
    }

    public static Beverage addCondiment(Condiment condiment, Beverage beverage) {
        return switch(condiment) {
            case BOBA_PEARLS -> new BobaPearls(beverage);
            case MATCHA_CREAM -> new MatchaCream(beverage);
            case PECANS -> new Peacans(beverage);
            case STRAWBERRIES -> new Strawberries(beverage);
        };
    }

    public static Beverage buildDrink(BaseDrink baseDrink, Condiment ...condiments) {
        Beverage drink = addBase(baseDrink);
        for (Condiment condiment : condiments) {
            drink = addCondiment(condiment, drink);
        }
        return drink;
    }
}
