package org.example.examples.builderPattern.items.impl;

import org.example.examples.builderPattern.items.Burger;

public class NonVegBurger extends Burger {
    @Override
    public String name() {
        return "Non-veg Burger";
    }

    @Override
    public Float price() {
        return 30.0f;
    }
}
