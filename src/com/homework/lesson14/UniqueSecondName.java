package com.homework.lesson14;

import java.util.*;

/*
*
*
*   Написать метод isUnique, который принимает Map<String, String> и возвращает true,
*   если два различных ключа не соответствуют двум одинаковым значениям.
*   Например, в данном случае вернётся true:
*   {Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}
*   А в данном - false:
*   {Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins} 
*
*
* */

public class UniqueSecondName {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        Map<String, String> mapTwo = new HashMap<>();

        map.put("Marty","Stepp"); map.put("Stuart", "Reges"); map.put("Jessica", "Miller");
        mapTwo.put("Kendrick","Perkins"); mapTwo.put("Stuart", "Reges"); mapTwo.put("Bruce", "Reges");

        System.out.println(isUnique(map));
        System.out.println(isUnique(mapTwo));

    }

    public static boolean isUnique(Map<String, String> map) {
        Set<String> set = new HashSet<>(map.values());

       return set.size() == map.values().size();
    }
}
