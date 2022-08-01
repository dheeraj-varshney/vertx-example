package org.example.examples.builderPattern.meals;

import org.example.examples.builderPattern.Item;

import java.util.ArrayList;

public class Meal {
    public ArrayList<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void showMeal() {
        for (Item item : itemList) {
            System.out.print("Name: " + item.name());
            System.out.print(", Packing: " + item.packing().pack());
            System.out.println(", Price: " + item.price());
        }
    }

    public Float getCost() {
        Float cost = 0.0f;
        for (Item item : itemList) {
            cost += item.price();
        }
        return cost;
    }
}
