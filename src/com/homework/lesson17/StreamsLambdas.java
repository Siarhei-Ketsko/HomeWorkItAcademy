package com.homework.lesson17;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsLambdas {

    private static long start;
    private static long end;

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

        start = System.currentTimeMillis();

        double average = list.stream()
                .filter(number -> number % 2 != 0 && number % 5 == 0)
                .collect(Collectors.averagingInt(Integer::intValue));

        end = System.currentTimeMillis() - start;

        System.out.println(average + " v1 " + end + " ms");

        start = System.currentTimeMillis();

        double averageTwo = list.stream()
                .filter(number -> number % 2 != 0 && number % 5 == 0)
                .mapToLong(number -> number)
                .average()
                .orElse(0);

        end = System.currentTimeMillis() - start;

        System.out.println(averageTwo + " v2 " + end + " ms" + "\n");

    }

    private static void getUniqueStrings(List<String> strings) {

        start = System.currentTimeMillis();

        strings.stream()
                .filter(x -> x.length() > 8)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        end = System.currentTimeMillis() - start;

        System.out.println(" v1 " + end + " ms");

        start = System.currentTimeMillis();

        strings.stream()
                .filter(x -> x.length() > 8)
                .distinct()
                .forEach(System.out::println);

        end = System.currentTimeMillis() - start;

        System.out.println(" v2 " + end + " ms" + "\n");

    }

    private static void getSumValues(Map<String, Integer> map) {

        start = System.currentTimeMillis();

        int sum = map.entrySet().stream()
                .filter(x -> x.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .reduce((acc, x) -> x + acc).orElse(0);

        end = System.currentTimeMillis() - start;

        System.out.println(sum + " v1 " + end + " ms");

        start = System.currentTimeMillis();

        int sumTwo = map.entrySet().stream()
                .filter(x -> x.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();

        end = System.currentTimeMillis() - start;

        System.out.println(sumTwo + " v2 " + end + " ms" + "\n");



    }

    private static void getConcatString(List<Integer> list) {

        start = System.currentTimeMillis();

        String result = list.stream()
                .map(String::valueOf)
                .reduce((x, y) -> x + y)
                .orElse("");

        end = System.currentTimeMillis() - start;

        System.out.println(result + " v1 " + end + " ms");

        start = System.currentTimeMillis();

        String resultTwo = list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

        end = System.currentTimeMillis() - start;

        System.out.println(resultTwo + " v2 " + end + " ms");

    }

}
