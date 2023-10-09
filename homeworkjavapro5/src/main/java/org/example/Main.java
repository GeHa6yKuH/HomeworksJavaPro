package org.example;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
//import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(32, 2, 5, 67, 15, 30, 89, 4, 5);


        // 1 task

        List<Integer> list3 = list.stream()
                .filter(digit -> digit % 2 == 1)
                .toList();
        System.out.println(list3);

        // 2 task

        List<String> strings = new ArrayList<>();
        strings.add("23");
        strings.add("56");
        strings.add("89");
        strings.add("56");
        strings.add("90");

        List<Integer> listInts = new ArrayList<>();
        strings.forEach(el -> listInts.add(Integer.parseInt(el)));
        System.out.println(listInts);

        // 3 task

        AtomicInteger sum = new AtomicInteger();
        list.forEach(sum::addAndGet);
        System.out.println(sum);

        // 4 task

        Optional<Integer> optionalInteger = list.stream()
                .max(Comparator.naturalOrder());
        System.out.println(optionalInteger);

        // 5 task

        List<String> strings1 = new ArrayList<>();
        strings1.add("Abra kadabra");
        strings1.add("Ne abra kadabra");
        List<String> stringi = strings1.stream()
                .filter(st -> st.startsWith("A"))
                .map(String::toUpperCase)
                .toList();
        System.out.println(stringi);

        // 6 task

        List<String> strings2 = new ArrayList<>();
        strings2.add("Palka");
        strings2.add("Reka");
        strings2.add("Palka");
        strings2.add("AoP");
        strings2.add("Alfavit");
        strings2.add("Solnce");

        List<String> stringList = strings2.stream()
                .filter(st -> st.length() > 4)
                .distinct()
                .toList();
        System.out.println(stringList);

        // 7 task

        List<Person> people = new ArrayList<>();
        people.add(new Person("Andrey", 56));
        people.add(new Person("Andrey", 45));
        people.add(new Person("Anatoli", 61));
        people.add(new Person("Bogdan", 23));
        people.add(new Person("Mihail", 19));

        List<String> stringList1 = people.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .map(Person::toString)
                .toList();
        System.out.println(stringList1);

        // 8 task

        int sum1 = list.stream()
                .filter(inta -> inta % 3 == 0)
                .filter(inta -> inta % 5 == 0)
                .reduce(0, Integer::sum);
        System.out.println(sum1);

        // 9 task

        List<String> stringList2 = strings2.stream()
                .filter(st -> {
                    char[] chars = st.toCharArray();
                    for (int i = 0; i < chars.length; i++) {
                        for (int j = i + 1; j < chars.length; j++) {
                            if (chars[i] == chars[j]) return false;
                        }
                    }
                    return true;
                })
                .toList();
        System.out.println(stringList2);


        // следующие задачи

        System.out.println("*****************************************************************************************************");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(10);
        integerList.add(55);
        integerList.add(6);
        integerList.add(7);
        integerList.add(2);


        // 1 task

        System.out.println(new Main().doTask1(integerList));

        // 2 task

        System.out.println(new Main().doTask2(stringi));

        // 3task

        System.out.println("3 task" + new Main().doTask3(integerList));

        // 4 task

        System.out.println("4 task"+new Main().doTask4(strings2));

        // 5 task

        System.out.println("5 task " + new Main().doTask5(strings2));

        // 6 task

        System.out.println("6 task" + new Main().doTask6(integerList));

        // 7 task

        System.out.println(new Main().doTask7(strings2));

        // task 8

        System.out.println("5 task: " + new Main().doTask8(integerList));

        // task 9

        List<Integer> integers = Arrays.asList(2, 4, 6);
        System.out.println(new Main().doTask9(integers));

        // 10 task
        System.out.println(new Main().doTask10(strings2));

        // 11 task
        System.out.println("11 task" + new Main().doTask11(integers));

        // 12 task
        System.out.println(new Main().doTask12(strings2));

        // 13 task
        System.out.println(new Main().doTask13(strings2));

        // 14 task
        System.out.println(new Main().doTask14(strings2));

        // 15 task
        List<User> users = new ArrayList<>();
        users.add(new User("Alex", 18));
        users.add(new User("Bogdan", 21));
        users.add(new User("Andrey", 17));
        users.add(new User("Sasha", 24));
        users.add(new User("Lena", 28));
        System.out.println(new Main().doTask15(users));
    }

    // task 1
    public List<Integer> doTask1(List<Integer> list) {
        return list.stream()
                .filter(in -> in % 2 == 0)
                .map(in -> in * 2)
                .toList();
    }

    // task 2
    public List<String> doTask2(List<String> strings) {
        return strings.stream()
                .distinct()
                .toList();
    }

    // task 3
    public List<Integer> doTask3(List<Integer> integers) {
        return integers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();
    }


    // task 4
    public List<String> doTask4(List<String> strings) {
        return strings.stream()
                .filter(st -> st.startsWith("A"))
                .map(String::toUpperCase)
                .toList();
    }


    // task 5
    public List<String> doTask5(List<String> strings) {
        return strings.stream()
                .skip(2)
                .toList();
    }

    // task 6
    public List<Integer> doTask6(List<Integer> list) {
        return list.stream()
                .filter(integ -> integ > 50)
                .map(integ -> integ * integ)
                .toList();
    }

    // task 7
    public List<String> doTask7(List<String> strings) {
        return strings.stream()
                .filter(o -> o.contains("o"))
                .sorted(Collections.reverseOrder())
                .toList();
    }

    // task 8
    public List<Integer> doTask8(List<Integer> integers) {
        return integers.stream()
                .filter(inter -> inter % 2 == 1)
                .sorted(Comparator.naturalOrder())
                .toList();
    }

    // task 9
    public double doTask9(List<Integer> integers) {
        return (double) integers.stream()
                .reduce(0, Integer::sum) / integers.size();
    }

    // task 10
    public String doTask10(List<String> strings) {
        StringBuilder stringBuilder = new StringBuilder();
        strings.forEach(str -> stringBuilder.append(str).append(","));
        return stringBuilder.toString();
    }

    // task 11
    public List<Integer> doTask11(List<Integer> integers) {
        return integers.stream()
                .map(inta -> inta * inta)
                .toList();
    }

    // task 12
    public List<Character> doTask12(List<String> strings) {
        List<Character> characters = new ArrayList<>();
        strings
                .forEach(str -> {
                    for (int i = 0; i < str.toCharArray().length; i++) {
                        characters.add(str.toCharArray()[i]);
                    }
                });
        return characters.stream()
                .sorted(Comparator.naturalOrder())
                .toList();
    }

    // task 13

    public List<String> doTask13(List<String> strings) {
        List<String> list = new ArrayList<>(strings.stream().limit(3).toList());
        Collections.reverse(list);
        return list;
    }

    // task 14

    public List<String> doTask14(List<String> strings) {
        return strings.stream()
                .skip(2)
                .distinct()
                .toList();
    }

    // task 15

    public List<User> doTask15(List<User> users) {
        return users.stream()
                .filter(usi -> usi.getAge() >= 18)
                .sorted(Comparator.comparingInt(User::getAge))
                .toList();
    }

}