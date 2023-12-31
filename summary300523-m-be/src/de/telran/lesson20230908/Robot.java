package de.telran.lesson20230908;

public class Robot  implements Playable, Workable, Walkable {

    @Override
    public void play() {
        System.out.println("Robot plays");

    }

    @Override
    public void play(Playable playable) {
        System.out.println("Robot plays with " + playable);
    }

    @Override
    public void work() {
        System.out.println("Robot works");
    }

    @Override
    public void walk(Pet pet) {
        System.out.println("Robot walks with " + pet);
    }
}
