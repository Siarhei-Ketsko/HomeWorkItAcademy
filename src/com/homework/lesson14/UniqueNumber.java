package com.homework.lesson14;

import java.util.*;

/*
*
*   Написать метод countUnique, который принимает целочисленный список
*   в качестве параметра и возвращает количество уникальных целых чисел в этом списке.
*   При получении пустого списка метод должен возвращать 0.
*   Пример:
*   [3, 7, 3, -1, 2, 3, 7, 2, 15, 15] вернёт 5.
*
* */

public class UniqueNumber {

    public static int[] arr = new int[]{3, 7, 3, -1, 2, 3, 7, 2, 15, 15};

    public static void main(String[] args) {

        List list = new ArrayList(11);


      for (int i = 0; i < arr.length; i++) {

         list.add(arr[i]);
      }

        System.out.println(countUnique(list));

    }

    public static int countUnique(List<Integer> arr) {

        Set<Integer> set = new HashSet<>(arr);

        return set.size();
    }

}
