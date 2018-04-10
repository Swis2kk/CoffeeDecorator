package com.company.condiments;

import com.company.beveragers.Beverage;

public class Sugar extends CondimentDecorator {
    Beverage beverage;

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Sugar";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
