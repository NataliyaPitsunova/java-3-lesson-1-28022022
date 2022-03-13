package com.geekbrains.fruits;

public class Task {
    public static void main(String[] args) {
        Box<Orange> box1 = new Box();
        Box<Apple> box2 = new Box();
        Box<Orange> box3 = new Box();

        box1.add(new Orange(), 6);
        box2.add(new Apple(), 4);
        box3.add(new Orange(), 3);

        System.out.println("Вес коробки №1: " + box1.getWeight());
        System.out.println("Вес коробки №2: " + box2.getWeight());
        System.out.println("Вес коробки №3: " + box3.getWeight());

        System.out.println("Равны ли первая и вторая коробки : " + box1.compare(box2));
        System.out.println("Равны ли вторая и третья коробки : " + box1.compare(box3));

        box1.pourOver(box3);

        System.out.println("Вес коробки №3: " + box3.getWeight() + "; Вес коробки №1: " + box1.getWeight());
    }
}
