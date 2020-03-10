package com.homework.lesson9;

import org.apache.log4j.Logger;

public class GenerateArrayIndexOutE {

    private static final Logger LOGGER = Logger.getLogger(GenerateArrayIndexOutE.class);

    public static void main(String[] args) {
        try {
            generateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            LOGGER.error("Выход за пределы массива " + e.getMessage(), e);
        }

    }

    public static void generateException() {

        throw new ArrayIndexOutOfBoundsException();
    }

}
