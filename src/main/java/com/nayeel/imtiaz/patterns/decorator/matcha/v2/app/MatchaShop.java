package com.nayeel.imtiaz.patterns.decorator.matcha.v2.app;

import com.nayeel.imtiaz.patterns.decorator.matcha.v2.BaseDrinks;
import com.nayeel.imtiaz.patterns.decorator.matcha.v2.Beverage;
import com.nayeel.imtiaz.patterns.decorator.matcha.v2.CondimentFactory;
import com.nayeel.imtiaz.patterns.decorator.matcha.v2.Condiments;
import com.nayeel.imtiaz.patterns.decorator.matcha.v2.MatchaFactory;

public class MatchaShop {
    public static void main(String[] args) {
        Beverage drink1 = MatchaFactory.addBase(BaseDrinks.CEREMONIALMATCHA);

        Beverage drink2 = CondimentFactory.addCondiment(
            Condiments.STRAWBERRIES,
            CondimentFactory.addCondiment(
                Condiments.MATCHACREAM,
                CondimentFactory.addCondiment(
                    Condiments.BOBAPEARLS,
                    MatchaFactory.addBase(BaseDrinks.HOJICHAMATCHA)
                )
            )
        );

        Beverage drink3 = CondimentFactory.addCondiment(
                Condiments.PEACANS,
                MatchaFactory.addBase(BaseDrinks.COCONUTMATCHA)
        );

        System.out.printf("Drink 1: %s -> $%.2f", drink1.getDescription(), drink1.getCost());
        System.out.println();

        System.out.printf("Drink 2: %s -> $%.2f", drink2.getDescription(), drink2.getCost());
        System.out.println();

        System.out.printf("Drink 3: %s -> $%.2f", drink3.getDescription(), drink3.getCost());
        System.out.println();
    }
}
