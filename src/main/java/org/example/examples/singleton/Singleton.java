package org.example.examples.singleton;

public class Singleton {
    private static Integer count = 0;
    private static Singleton instance = new Singleton();

    private Singleton() {
        count++;
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void display() {
        System.out.println("Instance " + count);
    }
}
