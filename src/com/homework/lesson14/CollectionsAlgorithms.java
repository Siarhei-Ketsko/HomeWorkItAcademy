package com.homework.lesson14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Использовать Алгоритмы. Не используя вспомогательных объектов,
переставить отрицательные элементы сгенерированного списка в конец,
а положительные – в начало этого списка.
 */


public class CollectionsAlgorithms {

    public static void main(String[] args) {

        List<Integer> algorithms = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            algorithms.add((int) (Math.random()*50)-15);
        }
        Collections.sort(algorithms);
        Collections.reverse(algorithms);

        System.out.println(algorithms);
    }

}
