package com.homework.lesson9;

import java.io.IOException;

public class RandomException {
   private int i;
    public void generateRandomException() throws IOException {
        i = (int)(Math.random() *3);
        if (i == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        else if (i == 1) {
            throw new IOException();
        }
        else if (i == 2) {
            throw new ArithmeticException();
        }
    }
    public void fiftyPrecentChanceException(){
        i = (int)(Math.random() * 2);
        System.out.println(i);
        if (i == 1) {
            throw new ArithmeticException();
        }
    }
}
