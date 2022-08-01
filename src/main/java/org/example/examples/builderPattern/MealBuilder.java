package org.example.examples.builderPattern;

import org.example.examples.builderPattern.items.impl.Coke;
import org.example.examples.builderPattern.items.impl.NonVegBurger;
import org.example.examples.builderPattern.items.impl.Pepsi;
import org.example.examples.builderPattern.items.impl.VegBurger;
import org.example.examples.builderPattern.meals.Meal;

public class MealBuilder {
    public Meal vegMeal() {
        Meal vegMeal = new Meal();
        vegMeal.addItem(new VegBurger());
        vegMeal.addItem(new Pepsi());
        vegMeal.addItem(new Coke());
        return vegMeal;
    }

    public Meal nonvegMeal() {
        Meal meal = new Meal();
        meal.addItem(new NonVegBurger());
        meal.addItem(new Coke());
        return meal;
    }
}
