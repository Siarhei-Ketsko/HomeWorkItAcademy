package com.homework.lesson18;

import java.util.EnumMap;
import java.util.Map;

public class MadScientist implements Runnable {

    FactoryDump factoryDump;

    private static EnumMap<Parts, Integer> robotParts = new EnumMap<>(Parts.class);


    public MadScientist(FactoryDump factoryDump) {
        this.factoryDump = factoryDump;
    }

    public void countRandomPartsFromDump(int count) {

        factoryDump.getPart(count);

    }

    private void createRobots() {

        if (robotParts.size() == 9) {

            System.out.println("All parts: " + robotParts);

            System.out.println("MadScientist create: " + robotParts.values().stream()
                    .min(Integer::compare)
                    .orElse(0) + " robots");
        } else {

            System.out.println(0);
        }


    }

    public static void addToMapScientist(Parts part) {

        if (robotParts.get(part) == null) {

            robotParts.put(part, 1);

        } else {

            for (Map.Entry<Parts, Integer> pair : robotParts.entrySet()) {

                if (pair.getKey().equals(part)) {

                    pair.setValue(pair.getValue() + 1);

                }
            }

        }

    }

    @Override
    public void run() {

        for (int i = 0; i < 50; i++) {

            countRandomPartsFromDump((int) (1 + Math.random() * 4));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (i == 49) {

                createRobots();
            }
        }

    }
}
