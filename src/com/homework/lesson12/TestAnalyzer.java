package com.homework.lesson12;

public class TestAnalyzer {

    public static void main(String[] args) {
        ClassAnalyzer.analyzeClass(TestAnalyzer.class);
    }

    @Transaction
    public void test() {

        System.out.println("test");
    }

}
