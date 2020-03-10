package com.homework.lesson9;

public class GenerateArrayIndexOutE {
    public static void main(String[] args) {
        try {
            generateException();
        }
        catch (IndexOutOfBoundsException e){

        }

    }
    public static void generateException() {
        throw new IndexOutOfBoundsException();
    }

}
