package com.geekbrains.fruits;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    ArrayList<T> boxFruit = new ArrayList();


    public Box() {
        this.boxFruit = boxFruit;
    }

    public void add(T fruit, int quantity) {
        for (int i = 0; i < quantity; i++) {
            boxFruit.add(fruit);
        }
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T fr : boxFruit
        ) {
            weight += fr.getWeight();

        }
        return weight;
    }

    public boolean compare(Box anotherBox) {
        if (getWeight() == anotherBox.getWeight()) return true;
        return false;
    }

    public void pourOver(Box <T> anotherBox){

        anotherBox.boxFruit.addAll(boxFruit);
        boxFruit.clear();
    }
}
