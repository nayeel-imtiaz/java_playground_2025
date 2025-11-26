package com.nayeel.imtiaz.patterns.factory.method.matcha;

public class MatchaFactory {
    private MatchaFactory() {}

    public static Beverage baseDrink(BaseDrinkType baseDrinkType) {
        return switch (baseDrinkType) {
            case CEREMONIAL_MATCHA -> new CeremonialMatcha();
            case GENMAICHA_LATTE -> new GenmaichaLatte();
            case HOJICHA_LATTE -> new HojichaLatte();
        };
    }

    public static Beverage addCondiment(Beverage base, CondimentType condiment) {
        return switch (condiment) {
            case BOBA_PEARLS -> new BobaPearls(base);
            case HONEY_DRIZZLE -> new HoneyDrizzle(base);
            case MATCHA_FOAM_CREAM -> new MatchaFoamCream(base);
            case OAT_MILK -> new OatMilk(base);
        };
    }

    public static Beverage build(BaseDrinkType base, CondimentType... condiments) {
        Beverage beverage = baseDrink(base);
        for (CondimentType c : condiments) {
            beverage = addCondiment(beverage, c);
        }
        return beverage;
    }
}
