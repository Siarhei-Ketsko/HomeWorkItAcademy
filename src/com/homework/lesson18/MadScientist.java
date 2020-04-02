package com.homework.lesson18;

import java.util.EnumMap;

public class MadScientist implements Runnable {

    FactoryDump factoryDump;

    private int countDays = 1;

  EnumMap<Parts, Integer> robotParts = new EnumMap<>(Parts.class);


    public MadScientist(FactoryDump factoryDump) {
        this.factoryDump = factoryDump;
    }

    public  void takeFromFactoryDump(int count) {


        factoryDump.getPart(count);

    }

    @Override
    public void run() {

        for (int i = 0; i < 50; i++) {

                takeFromFactoryDump((int) (Math.random() * 4));

        }

    }
}
