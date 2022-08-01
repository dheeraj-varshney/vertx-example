package org.example.examples.builderPattern.items.impl;

import org.example.examples.builderPattern.items.Colddrink;

public class Pepsi extends Colddrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public Float price() {
        return 35.0f;
    }
}
