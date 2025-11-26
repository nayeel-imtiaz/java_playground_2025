package com.nayeel.imtiaz.patterns.factory.method.matcha.app;

import com.nayeel.imtiaz.patterns.factory.method.matcha.BaseDrinkType;
import com.nayeel.imtiaz.patterns.factory.method.matcha.Beverage;
import com.nayeel.imtiaz.patterns.factory.method.matcha.CondimentType;
import com.nayeel.imtiaz.patterns.factory.method.matcha.MatchaFactory;

public class MatchaShop {
    public static void main(String[] args) {
        Beverage drink1 = MatchaFactory.build(
                BaseDrinkType.CEREMONIAL_MATCHA,
                CondimentType.OAT_MILK,
                CondimentType.HONEY_DRIZZLE
        );
        System.out.printf("drink1: %s --> $%.2f\n\n", drink1.getDescription(), drink1.cost());

        Beverage drink2 = MatchaFactory.build(
                BaseDrinkType.HOJICHA_LATTE,
                CondimentType.MATCHA_FOAM_CREAM,
                CondimentType.BOBA_PEARLS,
                CondimentType.HONEY_DRIZZLE
        );
        System.out.printf("drink2: %s --> $%.2f\n\n", drink2.getDescription(), drink2.cost());

        Beverage drink3 = MatchaFactory.build(
                BaseDrinkType.GENMAICHA_LATTE,
                CondimentType.OAT_MILK,
                CondimentType.MATCHA_FOAM_CREAM
        );
        System.out.printf("drink3: %s --> $%.2f\n\n", drink3.getDescription(), drink3.cost());
    }
}
