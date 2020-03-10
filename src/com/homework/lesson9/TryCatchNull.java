package com.homework.lesson9;

import org.apache.log4j.Logger;

public class TryCatchNull {

    private static final Logger LOGGER = Logger.getLogger(TryCatchNull.class);

    public static void main(String[] args) {
         String test = null;
        try {
            goTest(test);
            LOGGER.info("Before call \"test\" method");

        }
        catch (NullPointerException e){
            LOGGER.info("Start exception handling ----------");
            LOGGER.error("NullPointerException" + e.getMessage(), e);
            LOGGER.info("End exception handling ----------");
        }

    }
    public static void goTest(String test){
        System.out.println(test.length());
    }
}