package com.homework.lesson14;

import java.util.*;

public class BlackBox {

    private TreeSet<Integer> set;


    public BlackBox(TreeSet<Integer> set) {
        this.set = set;
    }


    public void addNumber(int number) {

        set.add(number);

    }


    public void minK(int min) {

        List list = new ArrayList(set);


        System.out.println(list.get(min - 1));

    }

    public void maxN(int max) {
        List list = new ArrayList(set);

        System.out.println(list.get(list.size() - max));


    }

}
