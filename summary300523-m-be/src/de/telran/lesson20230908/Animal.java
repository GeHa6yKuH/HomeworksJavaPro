package de.telran.lesson20230908;

public abstract class Animal implements Playable {

    private String name;
    private int age;
    private boolean isHungry;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.isHungry = true;
    }

    public void feed(){
        isHungry = false;
        System.out.println(this.getClass().getSimpleName() + " is not hungry anymore");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public abstract void sayHello();

    @Override
    public void play() {
        System.out.println("Animal " + name + " plays");
    }

    @Override
    public String toString() {
        return "Animal{" + "name='" + name + '\'' + '}';
    }
}
