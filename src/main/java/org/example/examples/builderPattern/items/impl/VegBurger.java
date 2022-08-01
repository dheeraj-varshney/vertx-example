package org.example.examples.builderPattern.items.impl;

import org.example.examples.builderPattern.items.Burger;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public Float price() {
        return 25.0f;
    }
}
