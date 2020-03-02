package com.homework.lesson5;

import java.math.BigDecimal;



public class IntDoubleOverload {
    private int numberOne;
    private int numberTwo;


    IntDoubleOverload(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }



  public int addition() {
      System.out.println("Отработал int");
        return numberOne + numberTwo;
    }

   public BigDecimal addition(BigDecimal numberOne, BigDecimal numberTwo) {
       System.out.println("Отработал BigDecimal");
        return numberOne.add(numberTwo);
    }

    public int subtraction() {
        System.out.println("Отработал int");
        return  numberOne - numberTwo;
    }

    public BigDecimal subtraction(BigDecimal numberOne, BigDecimal numberTwo) {
        System.out.println("Отработал BigDecimal");
        return  numberOne.subtract(numberTwo);
    }


    public static void main(String[] args) {
        IntDoubleOverload test = new IntDoubleOverload(22,15);
        System.out.println(test.addition());
        System.out.println(test.addition(new BigDecimal("133131312.34"),new BigDecimal("34324234242.35")));
        System.out.println(test.subtraction());
        System.out.println(test.subtraction(new BigDecimal("5345553.34"), new BigDecimal("424234")));

    }
}
