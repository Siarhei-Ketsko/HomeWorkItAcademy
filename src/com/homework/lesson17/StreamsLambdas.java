package com.homework.lesson17;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsLambdas {

    private static int[] arr = new int[]{13, 5, 43, 42, 15, 26, 18, 67, 25};

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            list.add(arr[i]);
        }

        List<String> strings = new ArrayList<>();

        strings.add("Тестстроки1");
        strings.add("Тестстроки1");
        strings.add("Тестстроки2");
        strings.add("Тестст3");
        strings.add("Тестст5");


        Map<String, Integer> map = new HashMap<>();

        map.put("1234567", 1);
        map.put("123456", 2);
        map.put("12345", 3);
        map.put("123445678", 4);
        map.put("123", 5);
        map.put("fd", 1);

        getAverage(list);

        getUniqueStrings(strings);

        getSumValues(map);

        getConcatString(list);


    }

    private static void getAverage(List<Integer> list) {

        double average = list.stream().filter(x -> x % 5 == 0).collect(Collectors.averagingInt(Integer::intValue));

        System.out.println(average);

    }

    private static void getUniqueStrings(List<String> strings) {

        strings.stream().filter(x -> x.length() > 8).collect(Collectors.toSet()).forEach(System.out::println);

    }

    private static void getSumValues(Map<String, Integer> map) {

        int sum = map.entrySet().stream()
                .filter(x -> x.getKey().length() < 7)
                .map(Map.Entry::getValue)
                .reduce((acc, x) -> x + acc).orElse(0);

        System.out.println(sum);


    }

    private static void getConcatString(List<Integer> list) {

        String result = list.stream().map(Object::toString).reduce((x, y) -> x + "" + y).orElse("");
        System.out.println(result);

    }

}
