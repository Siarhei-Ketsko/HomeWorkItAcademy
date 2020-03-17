package com.homework.lesson12;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class ClassAnalyzer {

    public static void analyzeClass(Class clazz) {

        analyzeTransaction(clazz);
    }

    private static void analyzeTransaction(Class clazz) {
        for (Method method : clazz.getMethods()) {

            if (true) {

                for (Annotation annotation : method.getAnnotations()) {
                    if (annotation instanceof Transaction) {

                        System.out.println("Transaction is started");

                        try {
                            method.invoke(new TestAnalyzer());

                        } catch (IllegalAccessException e) {
                            e.printStackTrace();

                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        }

                        System.out.println("Transaction is ended");
                    }

                }

            }

        }

    }

}
