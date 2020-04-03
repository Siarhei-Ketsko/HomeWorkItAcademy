package com.homework.lesson18;

public class TestFactory {

    public static void main(String[] args) throws InterruptedException {


        FactoryDump dump = new FactoryDump();

        MadScientist scientist = new MadScientist(dump);

        Factory factory = new Factory(dump);

        new Thread(factory).start();
        Thread.sleep(20);
        new Thread(scientist).start();


    }
}