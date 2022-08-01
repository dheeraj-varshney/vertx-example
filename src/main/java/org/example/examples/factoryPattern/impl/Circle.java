package org.example.examples.factoryPattern.impl;

import org.example.examples.factoryPattern.Shape;

public class Circle implements Shape {

    public void draw() {
        System.out.println("Drawing circle");
    }

    public void sides() {
        System.out.println("A circle has infinite sides");
    }
}
