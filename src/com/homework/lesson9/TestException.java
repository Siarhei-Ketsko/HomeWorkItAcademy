package com.homework.lesson9;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.Scanner;

public class TestException {

    private static final Logger LOGGER = Logger.getLogger(TestException.class);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Triangle triangle = new Triangle(4, 4, 12);
        RandomException randomException = new RandomException();
        System.out.printf("1. Проверить собственное исключение \"Существует ли треугольник\" %n" +
                "2. Проверить случайное исключение JDK словить его, бросить  свое исключение указав в качестве причины отловленное + Унаследованное от Runtime %n" +
                "3. Выбросить случайным образом одно из 3ех исключений %n" +
                "4. В 50%% случае выбросить исключение, протестировать работу finnaly %n");
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                testMyException(triangle); break;

            case 2:
                testExceptionJdkAndRuntime(triangle); break;

            case 3:
                testRandomException(randomException); break;

            case 4:
                testFiftyPercentAndFinally(randomException); break;
        }


    }

    public static void testFiftyPercentAndFinally(RandomException randomException) {
        try {
            randomException.fiftyPercentChanceException();
            System.out.println("Без ошибок");
        } catch (ArithmeticException e) {
            LOGGER.error("Ошибка", e);
        } finally {
            System.out.println("finally отработал");
        }
    }

    public static void testRandomException(RandomException randomException) {
        try {
            randomException.generateRandomException();
        } catch (Exception e) {
            LOGGER.error("Ошибка " + e);
        }
    }

    public static void testExceptionJdkAndRuntime(Triangle triangle) {
        try {
            triangle.throwsOneExceptionJdk();
        } catch (ArithmeticException e) {
            throw new MyRuntimeException("Возникла ошибка", e);

        }
    }

    public static void testMyException(Triangle triangle) {
        try {
            triangle.checkTriangle();
        } catch (NonexistentTriangleException e) {
            LOGGER.error(e.getMessage(), e);
        }
    }
}
