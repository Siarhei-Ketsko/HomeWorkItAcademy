package com.homework.lesson14;

import java.util.*;

/*
 *
 *Реализовать структуру «Черный ящик» хранящую целые числа.
 * Структура должна поддерживать операции добавления числа и возвращение
 * К-го по минимальности числа и N-ного по максимальности элемента из ящика.
 *
 * Первым использовал лист при условии если в ящике могут храниться одинаковые значения.
 * {-10, -6, -3, -2, -2, -2, -2, -1, 0, 1, 2, 4, 7, 7, 7, 8};
 *
 * */

public class BlackBox {

    private ArrayList<Integer> list;

    public BlackBox(ArrayList<Integer> list) {
        this.list = list;
    }

    public void addNumber(int number) {

        list.add(number);
    }


    public void minK(int min) {

        Set<Integer> set = new TreeSet<>(list);

       /* int i = 0;
        Iterator<Integer> iteratorSet = set.iterator();     // Либо пройтись итератором
        int res = 0;
        while (iteratorSet.hasNext() && i < min) {
            i++;
            res = iteratorSet.next();
        }
        System.out.println(res);*/

        List<Integer> setList = new ArrayList<>(set); // Либо скопировать в новый лист

        System.out.println(setList.get(min - 1));

    }

    public void maxN(int max) {

        Set<Integer> set = new TreeSet<>(list);

       /* int i = 0;
        Iterator<Integer> iteratorSet = set.iterator();            // Либо пройтись итератором
        int res = 0;
        while (iteratorSet.hasNext() && i < (set.size() + 1) - max) {
            i++;
            res = iteratorSet.next();
        }
        System.out.println(res);*/


        List setList = new ArrayList<>(set);                    // Либо скопировать в новый лист

        System.out.println(setList.get(setList.size() - max));

    }

}
