package org.example.examples.abstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType) {
        if (factoryType == null) {
            return null;
        }
        if (factoryType.equalsIgnoreCase("rounded")) {
            return new RoundedShapeFactory();
        }
        if (factoryType.equalsIgnoreCase("normal")) {
            return new ShapeFactory();
        }
        return null;
    }
}
