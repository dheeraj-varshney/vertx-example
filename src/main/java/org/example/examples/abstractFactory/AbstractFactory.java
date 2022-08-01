package org.example.examples.abstractFactory;

import org.example.examples.factoryPattern.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);
}
