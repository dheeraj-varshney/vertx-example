package org.example.examples.builderPattern.items;

import org.example.examples.builderPattern.Item;
import org.example.examples.builderPattern.packing.Packing;
import org.example.examples.builderPattern.packing.impl.Bottle;

public abstract class Colddrink implements Item {
    public abstract String name();

    public abstract Float price();

    public Packing packing() {
        return new Bottle();
    }
}
