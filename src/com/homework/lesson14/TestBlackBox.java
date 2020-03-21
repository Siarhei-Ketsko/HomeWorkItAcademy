package com.homework.lesson14;

import java.util.*;

public class TestBlackBox {

    public static int[] arr = new int[]{-10, -6, -1, -2, -3, 0, 1, 2, 4, 7, 8};

    public static void main(String[] args) {

        BlackBox box = new BlackBox(new TreeSet<>());


        for (int i = 0; i < arr.length; i++) {
            box.addNumber(arr[i]);

        }

        box.maxN(1);
        box.minK(1);
        box.addNumber(11);
        box.maxN(1);



    }


}




