package com.nayeel.imtiaz.patterns.decorator.matcha.v2.app;

import com.nayeel.imtiaz.patterns.decorator.matcha.v2.BaseDrink;
import com.nayeel.imtiaz.patterns.decorator.matcha.v2.Beverage;
import com.nayeel.imtiaz.patterns.decorator.matcha.v2.Condiment;
import com.nayeel.imtiaz.patterns.decorator.matcha.v2.MatchaFactory;

public class MatchaShop {
    public static void main(String[] args) {
        Beverage drink1 = MatchaFactory.addBase(BaseDrink.CEREMONIAL_MATCHA);

        Beverage drink2 = MatchaFactory.addCondiment(
            Condiment.STRAWBERRIES,
            MatchaFactory.addCondiment(
                Condiment.MATCHA_CREAM,
                MatchaFactory.addCondiment(
                    Condiment.BOBA_PEARLS,
                    MatchaFactory.addBase(BaseDrink.HOJICHA_MATCHA)
                )
            )
        );

        Beverage drink3 = MatchaFactory.addCondiment(
                Condiment.PECANS,
                MatchaFactory.addBase(BaseDrink.COCONUT_MATCHA)
        );

        System.out.printf("Drink 1: %s -> $%.2f", drink1.getDescription(), drink1.getCost());
        System.out.println();

        System.out.printf("Drink 2: %s -> $%.2f", drink2.getDescription(), drink2.getCost());
        System.out.println();

        System.out.printf("Drink 3: %s -> $%.2f", drink3.getDescription(), drink3.getCost());
        System.out.println();
    }
}
