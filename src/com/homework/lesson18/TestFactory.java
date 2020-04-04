package com.homework.lesson18;

public class TestFactory {

    public static void main(String[] args) {


        FactoryDump dump = new FactoryDump();

        MadScientist scientist = new MadScientist(dump);

        Factory factory = new Factory(dump);

        new Thread(factory).start();
        new Thread(scientist).start();

    }
}