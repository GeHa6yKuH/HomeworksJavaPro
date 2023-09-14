package de.telran.lesson20230908;

public class Wolf extends Animal{


    public Wolf(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayHello() {
        System.out.println("wooooooooooooof");
    }

    @Override
    public void play(Playable playable) {
        System.out.println("Wolf plays with " + playable);
    }

    @Override
    public void feed() {
        super.feed();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
