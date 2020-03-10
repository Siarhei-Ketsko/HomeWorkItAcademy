package com.homework.lesson9;

public class TryCatchNull {

    public static void main(String[] args) {
         String test = null;
        try {
            goTest(test);

        }
        catch (NullPointerException e){

        }

    }
    public static void goTest(String test){
        System.out.println(test.length());
    }
}