package de.telran.lesson20230908;

import de.telran.lesson20230901.Cat;

public class Main {
    public static void main(String[] args) {
        Dog dog= new Dog("Sharik", 3, "Black");
        Cat cat = new Cat("Alex", 3);
        Human human = new Human("Bogdan");
        human.play(cat);

        Wolf wolf = new Wolf("And", 7);
        wolf.play(cat);
        wolf.feed();
    }
}
