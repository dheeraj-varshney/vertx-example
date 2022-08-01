package org.example.examples.abstractFactory;

import org.example.examples.factoryPattern.Shape;
import org.example.examples.factoryPattern.impl.RoundedSquare;

public class RoundedShapeFactory extends AbstractFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("Square")) {
            return new RoundedSquare();
        }
        return null;
    }
}
