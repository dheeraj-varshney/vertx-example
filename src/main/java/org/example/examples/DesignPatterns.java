package org.example.examples;

import org.example.examples.abstractFactory.AbstractFactory;
import org.example.examples.abstractFactory.FactoryProducer;
import org.example.examples.builderPattern.MealBuilder;
import org.example.examples.builderPattern.items.impl.Pepsi;
import org.example.examples.builderPattern.meals.Meal;
import org.example.examples.factoryPattern.Shape;
import org.example.examples.factoryPattern.ShapeFactory;
import org.example.examples.singleton.Singleton;

public class DesignPatterns {

    // factory pattern demo
    public void factoryMethodExample() {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape square = shapeFactory.getShape("Square");
        square.draw();
        square.sides();

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();
        rectangle.sides();

        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
        circle.sides();
    }

    // abstract factory pattern demo
    public void abstractFactoryExample() {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("normal");
        Shape square = shapeFactory.getShape("square");
        square.draw();
        square.sides();

        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory("rounded");
        Shape square1 = roundedShapeFactory.getShape("square");
        square1.draw();
        square1.sides();
    }

    // singleton pattern demo
    public void singletonExample() {
        Singleton obj1 = Singleton.getInstance();
        obj1.display();

        Singleton obj2 = Singleton.getInstance();
        obj2.display();
    }

    // builder pattern demo
    public void builderExample() {
        MealBuilder meals = new MealBuilder();
        Meal vegMeal = meals.vegMeal();
        System.out.println("Veg Meal contains:");
        vegMeal.showMeal();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = meals.nonvegMeal();
        System.out.println("Non Veg Meal contains:");
        nonVegMeal.showMeal();
        System.out.println("Total Cost: " + nonVegMeal.getCost());

        Meal nonVeg2 = meals.nonvegMeal();
        System.out.println("Non Veg Meal 2 contains:");
        nonVeg2.addItem(new Pepsi());
        nonVeg2.showMeal();
        System.out.println("Total Cost: " + nonVeg2.getCost());
    }
}
