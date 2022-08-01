package org.example.examples.builderPattern.packing.impl;

import org.example.examples.builderPattern.packing.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapped";
    }
}
