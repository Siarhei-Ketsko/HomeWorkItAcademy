package com.homework.lesson14;

import java.util.HashSet;
import java.util.Set;

/*
*
*
Определить множество на основе множества целых чисел.
Создать методы для определения пересечения и объединения множеств.
*
*
* */

public class Sets {

    private Set<Integer> set;

    public Sets(Set<Integer> set) {
        this.set = set;
    }

    public static void main(String[] args) {

        Sets setOne = new Sets(new HashSet<>());
        Sets setTwo = new Sets(new HashSet<>());

        setOne.set.add(4);
        setOne.set.add(3);
        setOne.set.add(5);
        setOne.set.add(6);

        setTwo.set.add(1);
        setTwo.set.add(2);
        setTwo.set.add(3);

        intersection(setOne, setTwo);

        colligation(setOne, setTwo);

    }

    public static void colligation(Sets one, Sets two) {
        one.set.addAll(two.set);
        System.out.println(one.set);
    }

    public static void intersection(Sets one, Sets two) {
        System.out.println("Пересечения");
        for (Integer stOne : one.set) {
            for (Integer stTwo : two.set) {

                if (stOne.equals(stTwo)) {

                    System.out.println(stOne + " <---> " + stTwo);
                }
            }
        }
    }
}
