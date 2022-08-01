package org.example.examples.factoryPattern.impl;

import org.example.examples.factoryPattern.Shape;

public class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing rectangle");
    }

    public void sides() {
        System.out.println("A rectangle has four sides");
    }
}
