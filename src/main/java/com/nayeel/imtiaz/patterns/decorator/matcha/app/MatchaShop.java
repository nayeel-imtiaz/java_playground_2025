package com.nayeel.imtiaz.patterns.decorator.matcha.app;

import com.nayeel.imtiaz.patterns.decorator.matcha.Beverage;
import com.nayeel.imtiaz.patterns.decorator.matcha.BaseDrinkType;
import com.nayeel.imtiaz.patterns.decorator.matcha.CondimentType;
import com.nayeel.imtiaz.patterns.decorator.matcha.MatchaFactory;

public class MatchaShop {
    public static void main(String[] args) {
        Beverage drink1 = MatchaFactory.addCondiment(
                MatchaFactory.addCondiment(
                    MatchaFactory.baseDrink(BaseDrinkType.CEREMONIAL_MATCHA),
                    CondimentType.OAT_MILK
                ),
                CondimentType.HONEY_DRIZZLE
        );
        System.out.printf("drink1: %s --> $%.2f\n\n", drink1.getDescription(), drink1.cost());

//        Beverage drink2 = new HoneyDrizzle(new BobaPearls(new MatchaFoamCream(new HojichaLatte())));
//        System.out.printf("drink2: %s --> $%.2f\n\n", drink2.getDescription(), drink2.cost());
//
//        Beverage drink3 = new MatchaFoamCream(new OatMilk(new GenmaichaLatte()));
//        System.out.printf("drink3: %s --> $%.2f\n\n", drink3.getDescription(), drink3.cost());
    }
}
