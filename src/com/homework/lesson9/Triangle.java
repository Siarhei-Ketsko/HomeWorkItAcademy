package com.homework.lesson9;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void checkTriangle() throws NonexistentTriangleException {
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Треугольник существует");
        } else {
            throw new NonexistentTriangleException("Такого треугольника не сущесвтует");
        }
    }

 /*   public void throwsOneExceptionJdk() {
        throw new ArithmeticException();
    } */
}
