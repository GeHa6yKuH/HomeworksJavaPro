package de.telran.lesson20231027;

import de.telran.lesson20230901.Cat;
import de.telran.lesson20230908.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Cat> catList = new ArrayList<>();
        Cat cat = new Cat("Anna", 9);
        Cat cat1 = new Cat("Boris", 9);
        Cat cat2= new Cat("Svetlana", 9);
        catList.add(cat);
        catList.add(cat1);
        catList.add(cat2);

        feed(catList);

        for (Cat c : catList) {
            System.out.println(cat.isHungry());
        }

        List<Integer> integers = new ArrayList<>();
        integers.add(7);
        integers.add(8);
        integers.add(9);

        System.out.println(getSum(integers));

        System.out.println(getMap());

    }

    public static void feed(List<Cat> catList) {
        catList.stream().filter(Pet::isHungry).forEach(el -> el.setHungry(false));
    }

    public static int getSum(List<Integer> integers) {
        return integers.stream().filter(el -> el % 2 != 0).mapToInt(el -> el).sum();
    }

    public static Map<Boolean, List<Integer>> getMap() {
        List<Integer> integers = new ArrayList<>();
        int i = 0;
        while (i < 100) {
            integers.add(i++);
        }
        return integers.stream().collect(Collectors.groupingBy(el -> el % 3 == 0));
    }
}
