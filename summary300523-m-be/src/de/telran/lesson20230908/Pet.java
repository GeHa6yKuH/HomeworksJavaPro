package de.telran.lesson20230908;

public abstract class Pet extends Animal implements Playable{

    private boolean isHungry;

    public Pet() {
    }

    public Pet(String name, int age) {
        super(name, age);
        this.isHungry = true;
    }

    public void feed(){
        isHungry = false;
        System.out.println(this.getClass().getSimpleName() + " is not hungry anymore");
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }

    public int getAge() {
        return super.getAge();
    }

    public void setAge(int age) {
        super.setAge(age);
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public abstract void sayHello();
}
