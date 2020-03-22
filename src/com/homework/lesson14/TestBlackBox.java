package com.homework.lesson14;

import java.util.*;

public class TestBlackBox {

    public static int[] arr = new int[]{-10, -6, -3, -2, -2, -2, -2, -1, 0, 1, 2, 4, 7, 7, 7, 8};

    public static void main(String[] args) {

        BlackBox box = new BlackBox(new ArrayList<>());


      for (int i = 0;  i < arr.length; i++) {

          box.addNumber(arr[i]);

      }

      box.maxN(3);
      box.minK(5);

    }


}




