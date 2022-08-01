package org.example.examples.factoryPattern.impl;

import org.example.examples.factoryPattern.Shape;

public class RoundedSquare implements Shape {
    public void draw() {
        System.out.println("Drawing rounded square");
    }

    public void sides() {
        System.out.println("Sides not defined for rounded shaped");
    }
}
