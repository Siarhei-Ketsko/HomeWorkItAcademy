package com.homework.lesson12;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;


public class ClassAnalyzer {

    public static void analyzeClass(Class clazz) {

        analyzeTransaction(clazz);
        analyzeMethods(clazz);
        analyzeFields(clazz);
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

    public static void analyze(Class clazz) {

        for (Method method : clazz.getMethods()) {


        }


    }
    public static void analyzeFields (Class clazz) {
        for (Field field : clazz.getDeclaredFields()) { // Достаем все поля включая приватные.

            System.out.println("Fields name: " + field.getName() + "Fields type" + field.getType());

        }

    }

    public static void analyzeMethods(Class clazz) {

        for (Method method : clazz.getMethods()) {

            if (notObjectMethod(method)) {

                System.out.println("Method: " + method.getName() + " "
                        + "Method type: " + method.getReturnType() + " "
                        + "Method parameters: " + Arrays.toString(method.getParameterTypes()));
            }


        }

    }

    public static void analyzeConstructors(Class clazz) {

        for (Constructor constructor : clazz.getDeclaredConstructors()) {

            System.out.println();
        }
    }


    public static boolean notObjectMethod(Method method) {

        return !("equals".equals(method.getName()) || "wait".equals(method.getName()) || "toString".equals(method.getName())
                || "hashCode".equals(method.getName()) || "notify".equals(method.getName()) || "notifyAll".equals(method.getName()));
    }


}
