package org.example.examples.factoryPattern.impl;

import org.example.examples.factoryPattern.Shape;

public class Square implements Shape {

    public void draw() {
        System.out.println("Drawing square");
    }

    public void sides() {
        System.out.println("A square has four sides");
    }
}
