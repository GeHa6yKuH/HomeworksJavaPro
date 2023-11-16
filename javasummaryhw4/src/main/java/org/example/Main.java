package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        String[] filtered = filter(new String[]{"One", "Two", "Three"}, o1 -> o1.length() == 3);
        System.out.println(Arrays.toString(filtered));
    }

    public static <T> T[] filter(T[] ts, Filter<T> filter) {
        return Arrays.stream(ts).filter(filter::apply).toList().toArray(size -> Arrays.copyOf(ts, size));
    }


}