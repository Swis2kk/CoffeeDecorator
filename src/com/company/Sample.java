package com.company;

import com.company.beveragers.Beverage;
import com.company.beveragers.Espresso;
import com.company.beveragers.HouseBlend;
import com.company.condiments.Mocha;
import com.company.condiments.Sugar;

public class Sample {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + " " + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription()+ " " + beverage1.cost());

        Beverage beverage2 = new Mocha(new Mocha(new Espresso()));
        System.out.println(beverage2.getDescription() + " " + beverage2.cost());

        Beverage beverage3 = new Mocha(new Sugar(new Mocha(new Sugar(new Espresso()))));
        System.out.println(beverage3.getDescription() + " " + beverage3.cost());
    }
}
