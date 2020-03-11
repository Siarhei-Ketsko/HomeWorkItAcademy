package com.homework.lesson10;

public class ConcatenationString {
    private static String one = "One";
    private static String two = "Two";
    private static long start;
    private static long end;
    private static StringBuilder stb = new StringBuilder(one);


    public static void main(String[] args) {

        System.out.println("Время выполнения StringBuilder: " + testSpeedBuilder() + " ms");
        System.out.println("Время выполнения Concatenation: " + testSpeedConcat() + " ms");

    }

    public static long testSpeedBuilder() {
        start = System.currentTimeMillis();
        for (int i = 0; i < 99999; i++) {
            stb.append(two);
        }
        end = System.currentTimeMillis() - start;

        return end;
    }

    public static long testSpeedConcat() {
        start = System.currentTimeMillis();
        for (int i = 0; i < 99999; i++) {
            one = one.concat(two);

        }
        end = System.currentTimeMillis() - start;

        return end;
    }
}
