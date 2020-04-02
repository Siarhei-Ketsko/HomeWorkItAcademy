package com.homework.lesson18;

public class Factory implements Runnable {

    FactoryDump factoryDump;

    public Factory(FactoryDump factoryDump) {
        this.factoryDump = factoryDump;
    }

    public void getParts(int countParts) {

        factoryDump.putPart(countParts);

    }


    @Override
    public void run() {

        for (int i = 0; i < 50; i++) {

            if (i == 0) {

                getParts(20);

            }

            if (i > 0) {

                getParts((int) (Math.random() * 4));
            }

        }


    }

}

