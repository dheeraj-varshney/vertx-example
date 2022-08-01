package org.example.examples.builderPattern;

import org.example.examples.builderPattern.packing.Packing;

public interface Item {
    public String name();

    public Packing packing();

    public Float price();
}
