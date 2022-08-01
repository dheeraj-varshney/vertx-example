package org.example.examples.factoryPattern;

import org.example.examples.factoryPattern.impl.Circle;
import org.example.examples.factoryPattern.impl.Rectangle;
import org.example.examples.factoryPattern.impl.Square;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }
}
