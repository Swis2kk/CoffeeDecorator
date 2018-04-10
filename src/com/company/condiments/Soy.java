package com.company.condiments;

import com.company.beveragers.Beverage;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy (Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double cost() {
        return 0;
    }
}
