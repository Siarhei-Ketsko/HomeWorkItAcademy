package com.homework.lesson12;

public class TestAnalyzer {

   public int testField = 2;
   private String testStringField = "testStringFieldReflection";

    public static void main(String[] args) {
        ClassAnalyzer.analyzeClass(TestAnalyzer.class);

    }

    @Transaction
    public void testTransaction() {

        System.out.println("test");
    }
    public void testParametrsAnalyzer(String str) {

        System.out.println("test2");
    }
    public void testParametrsAnalyzerInt(int number) {

        System.out.println("test2");
    }

}
