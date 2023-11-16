package org.example;

import java.util.function.Predicate;

@FunctionalInterface
public interface Filter<T>{
    boolean apply(T t);
}
