package com.homework.lesson13;

import java.util.ArrayList;

public class CustomStack {

    private ArrayList<Integer> stk;


    public CustomStack(int size) {

        stk = new ArrayList<>(size);
    }


    public void push(int digit) {

        stk.add(digit);

    }

    public int pop() {
        if (stk.size() > 0) {

            return stk.remove(stk.size() - 1);

        } else throw new RuntimeException("Массив пустой");
    }

    public void printReversNumber() {

        for (int i = stk.size() - 1; i >= 0; i--) {

            System.out.println(stk.get(i));

        }

    }


}
