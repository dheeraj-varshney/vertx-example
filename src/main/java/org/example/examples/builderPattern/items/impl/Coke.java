package org.example.examples.builderPattern.items.impl;

import org.example.examples.builderPattern.items.Colddrink;

public class Coke extends Colddrink {
    @Override
    public String name() {
        return "Coca cola";
    }

    @Override
    public Float price() {
        return 40.0f;
    }
}
