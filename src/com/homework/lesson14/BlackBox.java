package com.homework.lesson14;

import java.util.*;

public class BlackBox {


    private ArrayList<Integer> lst;

    public BlackBox(ArrayList<Integer> lst) {
        this.lst = lst;
    }

    public void addNumber(int number) {

        lst.add(number);
    }


    public void minK(int min) {

        TreeSet<Integer> set = new TreeSet<>(lst);
        List<Integer> setList = new ArrayList<>(set);


        System.out.println(setList.get(min - 1));

    }

    public void maxN(int max) {

        TreeSet<Integer> set = new TreeSet<>(lst);
        List setList = new ArrayList<>(set);

        System.out.println(setList.get(setList.size() - max));


    }

}
