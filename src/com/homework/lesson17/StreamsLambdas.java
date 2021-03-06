package com.homework.lesson17;

import java.util.*;
import java.util.stream.Collectors;

/*
*
* Дан список целых чисел. Найти среднее всех нечётных чисел, делящихся на 5.
* Дан список строк. Найти количество уникальных строк длиной более 8 символов.
* Дана Map<String, Integer>. Найти сумму всех значений, длина ключей которых меньше 7 символов.
* Дан список целых чисел, вывести строку, представляющую собой конкатенацию строковых представлений этих чисел.
* Пример: список {5, 2, 4, 2, 1}
* Результирующая строка: "52421"
*
* */

public class StreamsLambdas {

    private static long start;
    private static long end;

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(13, 5, 43, 42, 15, 26, 18, 67, 25);

        List<String> strings = Arrays.asList("Тестстроки1", "Тестстроки1", "Тестстроки2", "Тестст3", "Тестст5", null);

        Map<String, Integer> map = Map.of("1234567", 1, "123456", 2, "12345", 3, "12345678", 4,
                "123", 5, "12", 1);

        getAverage(list);

        getUniqueStrings(strings);

        getSumValues(map);

        getConcatString(list);

    }

    private static void getAverage(List<Integer> list) {

        start = System.currentTimeMillis();

        double average = list.stream()
                .filter(number -> number % 2 != 0 && number % 5 == 0)
                .collect(Collectors.averagingLong(Integer::intValue));

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
                .filter(string -> string != null && string.length() > 8)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        end = System.currentTimeMillis() - start;

        System.out.println(" v1 " + end + " ms");

        start = System.currentTimeMillis();

        strings.stream()
                .filter(string -> string != null && string.length() > 8)
                .distinct()
                .forEach(System.out::println);

        end = System.currentTimeMillis() - start;

        System.out.println(" v2 " + end + " ms" + "\n");

    }

    private static void getSumValues(Map<String, Integer> map) {

        start = System.currentTimeMillis();

        int sum = map.entrySet().stream()
                .filter(keys -> keys.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .reduce((acc, value) -> acc + value).orElse(0);

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
                .reduce((acc, string) -> acc + string)
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
