package org.example.examples.builderPattern.packing.impl;

import org.example.examples.builderPattern.packing.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottled";
    }
}
