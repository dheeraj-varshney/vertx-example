package org.example.examples.builderPattern.items;

import org.example.examples.builderPattern.Item;
import org.example.examples.builderPattern.packing.Packing;
import org.example.examples.builderPattern.packing.impl.Wrapper;

public abstract class Burger implements Item {
    public abstract String name();

    public abstract Float price();

    public Packing packing() {
        return new Wrapper();
    }
}
