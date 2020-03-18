package com.homework.lesson12;

public class TestAnalyzer {

    public int testField = 2;
    private String testStringField = "testStringFieldReflection";

    public TestAnalyzer() {
    }

    TestAnalyzer(int test, String testString) {
        this.testField = test;
        this.testStringField = testString;
    }

    public static void main(String[] args) {
        TestAnalyzer test = new TestAnalyzer();
        ClassAnalyzer.analyze(test);
        System.out.println("/////////////////////");
        ClassAnalyzer.analyze(TestAnalyzer.class);

    }

    @Transaction(name = "Transaction")
    public void testTransaction() {

        System.out.println("testTransaction");
    }

    @Deprecated
    public void testParametrsAnalyzer(String str) {

        System.out.println("test2");
    }

    public void testParametrsAnalyzerInt(int number) {

        System.out.println("test2");
    }

}
