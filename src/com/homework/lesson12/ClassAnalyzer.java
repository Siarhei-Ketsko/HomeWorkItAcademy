package com.homework.lesson12;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;


public class ClassAnalyzer  {

    public static void analyze(Class clazz) {

        analyzeTransaction(clazz);
        analyzeClassMethods(clazz);
        analyzeClassFields(clazz);
        analyzeClassConstructors(clazz);
        analyzeClassAnnotation(clazz);
    }
    public static void analyze(Object object) {
        analyzeTransaction(object.getClass());
        analyzeClassMethods(object.getClass());
        analyzeClassFields(object.getClass());
        analyzeClassConstructors(object.getClass());
        analyzeClassAnnotation(object.getClass());

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


    public static void analyzeClassFields(Class clazz) {
        for (Field field : clazz.getDeclaredFields()) { // Достаем все поля включая приватные.

            System.out.println("Field name: " + field.getName() + " " + "Fields type " + field.getType());

        }

    }

    public static void analyzeClassMethods(Class clazz) {

        for (Method method : clazz.getMethods()) {

            if (notObjectMethod(method)) {

                System.out.println("Method: " + method.getName() + " "
                        + "Method type: " + method.getReturnType() + " "
                        + "Method parameters: " + Arrays.toString(method.getParameterTypes()));
            }


        }

    }

    public static void analyzeClassConstructors(Class clazz) {

        for (Constructor constructor : clazz.getDeclaredConstructors()) {

            System.out.println("Constructors: " + Arrays.toString(constructor.getParameterTypes()));
        }
    }

    public static void analyzeClassAnnotation(Class clazz) {

        if (clazz != null) {
            for (Annotation annotation : clazz.getAnnotations()) {
                printAnnotation(annotation);
                annotation.annotationType().getAnnotations();
            }

        }

    }


    public static boolean notObjectMethod(Method method) {

        return !("equals".equals(method.getName()) || "wait".equals(method.getName()) || "toString".equals(method.getName())
                || "hashCode".equals(method.getName()) || "notify".equals(method.getName()) || "notifyAll".equals(method.getName()));
    }

    public static void printAnnotation(Annotation annotation) {

        analyze(annotation.getClass());
    }


}
