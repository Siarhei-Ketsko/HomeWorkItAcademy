package com.homework.lesson9;

import org.apache.log4j.Logger;

import java.io.IOException;

public class TestException {

    private static final Logger LOGGER = Logger.getLogger(TestException.class);

    public static void main(String[] args) {


        Triangle triangle = new Triangle(4,12,12);

        try {
            triangle.checkTriangle();
        } catch (NonexistentTriangleException e) {
            LOGGER.error(e.getMessage(), e);
        }

       try {
         //  triangle.throwsOneExceptionJdk();
       }
       catch (ArithmeticException e) {
            throw new MyRuntimeException("Возникла ошибка", e);

       }

       RandomException randomException = new RandomException();
        try {
          //  randomException.generateRandomException();
        } catch (Exception e) {
            LOGGER.error("Ошибка");
        }
        try {
            randomException.fiftyPrecentChanceException();
            System.out.println("Без ошибок");
        }
        catch (ArithmeticException e) {
            LOGGER.error("Ошибка");
        }
        finally {
            System.out.println("finally отработал");
        }


    }
}
