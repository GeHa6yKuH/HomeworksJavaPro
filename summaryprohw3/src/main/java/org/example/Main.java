package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // 1 task

        String joke1 = "Бог смотрит на Землю вниз: Люди в больницах стоят, очереди, все больные, пенсионеры, кашляют, коляски инвалидные... Думает бог: — Сделаю доброе дело! Спустился вниз, сел в кабинет. Очередь: — Новый доктор, новый доктор... Заезжает инвалид на коляске. Бог ему: — Встань и иди! Тот встал и пошёл. Выходит, все его в очереди спрашивают: — Ну что, как новый доктор? — Да как.. Даже давление не померил.";
        String joke2 = """
                Сидят два 70 летних грузина, один другому говорит:
                — Гиви, я такой-же сильный как и 40 лет назад
                Гиви:
                — С чего ты взял?
                — Видишь вон тот камень? Я тогда его поднять не мог... И сейчас не могу...""";
        String joke3 = """
                Как-то раз я увидел, что на улице два подозрительных человека грабят богача.
                Я сразу бросился на выручку.
                Выручку пришлось делить на троих.""";
        String joke4 = "парень во время драки вспомнил, чему его учил отец, но умение коптить свинью не пригодилось ((";
        String joke5 = "О человеке можно судить по его обуви. Например если подошва его обуви бьётся о ваше лицо, то скорее всего человек чем-то расстроен.";

        String[] jokes = {joke1, joke2, joke3, joke4, joke5};

        Supplier<String> randomJoke = () -> jokes[new Random().nextInt(jokes.length - 1)];
        System.out.println(randomJoke.get());

        // 2 task

        Consumer<Integer> integerConsumer = el -> {
            if (el % 2 == 0) System.out.println(el);
            else System.err.println(el);
        };
        integerConsumer.accept(44);

        // 3 task

        Monkey monkey = new Monkey("Yellow");
        Monkey monkey1 = new Monkey("Red");
        Predicate<Monkey> monkeyPredicate = el -> el.getColor().equals("Yellow");
        System.out.println(monkeyPredicate.test(monkey1));

        // 4 task

        int temp = 20;
        Function<Integer, Integer> defineBorders = el -> el > - 100 && el < 100 ? el : el < -100 ? -100 : 100;
        Function<Integer, String> convertToString = el -> el <= 0 ? el + " degrees Celsius" : "+" + el + " degrees Celsius";
        Function<Integer, String> convertToCelsius = defineBorders.andThen(convertToString);
        System.out.println(convertToCelsius.apply(temp));

    }
}