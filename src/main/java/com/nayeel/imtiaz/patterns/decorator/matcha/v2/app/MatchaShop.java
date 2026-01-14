package com.nayeel.imtiaz.patterns.decorator.matcha.v2.app;

import com.nayeel.imtiaz.patterns.decorator.matcha.v2.BaseDrink;
import com.nayeel.imtiaz.patterns.decorator.matcha.v2.Beverage;
import com.nayeel.imtiaz.patterns.decorator.matcha.v2.Condiment;
import com.nayeel.imtiaz.patterns.decorator.matcha.v2.MatchaFactory;

public class MatchaShop {
    public static void main(String[] args) {
        Beverage drink1 = MatchaFactory.buildDrink(BaseDrink.CEREMONIAL_MATCHA);

        Beverage drink2 = MatchaFactory.buildDrink(
                BaseDrink.HOJICHA_MATCHA,
                Condiment.BOBA_PEARLS,
                Condiment.MATCHA_CREAM,
                Condiment.STRAWBERRIES
        );

        Beverage drink3 = MatchaFactory.buildDrink(
                BaseDrink.COCONUT_MATCHA,
                Condiment.PECANS
        );

        System.out.printf("Drink 1: %s -> $%.2f", drink1.getDescription(), drink1.getCost());
        System.out.println();

        System.out.printf("Drink 2: %s -> $%.2f", drink2.getDescription(), drink2.getCost());
        System.out.println();

        System.out.printf("Drink 3: %s -> $%.2f", drink3.getDescription(), drink3.getCost());
        System.out.println();
    }
}
