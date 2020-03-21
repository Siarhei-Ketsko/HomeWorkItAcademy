package com.homework.lesson14;

import java.util.*;

/*
*
*Реализовать структуру «Черный ящик» хранящую целые числа.
* Структура должна поддерживать операции добавления числа и возвращение
* К-го по минимальности числа и N-ного по максимальности элемента из ящика.
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

        TreeSet<Integer> set = new TreeSet<>(list);
        List<Integer> setList = new ArrayList<>(set);


        System.out.println(setList.get(min - 1));

    }

    public void maxN(int max) {

        TreeSet<Integer> set = new TreeSet<>(list);
        List setList = new ArrayList<>(set);

        System.out.println(setList.get(setList.size() - max));


    }

}
