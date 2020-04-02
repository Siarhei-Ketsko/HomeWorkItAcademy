package com.homework.lesson18;

import java.util.*;

public class FactoryDump {

    static EnumMap<Parts, Integer> parts = new EnumMap<>(Parts.class);


    public synchronized void getPart(int count) {

        for (int i = 0; i < count; i++) {

            List<Parts> rand = new ArrayList<>(parts.keySet());

            if (rand.size() != 0) {

                Parts part = rand.get((int) (Math.random() * rand.size()));

                for (Map.Entry<Parts, Integer> pair : parts.entrySet()) {

                    if (pair.getKey().equals(part)) {
                        if (pair.getValue() > 0) {

                            pair.setValue(pair.getValue() - 1);
                        }

                        if (pair.getValue() == 0) {

                            parts.remove(part);
                        }
                    }
                }

            }
        }



    }

    public synchronized void putPart(int count) {

        for (int i = 0; i < count; i++) {

            Parts part = Parts.values()[new Random().nextInt(Parts.values().length)];
            if (parts.get(part) == null) {

                parts.put(part, 1);
            } else {

                for (Map.Entry<Parts, Integer> pair : parts.entrySet()) {

                    if (pair.getKey().equals(part)) {

                        pair.setValue(pair.getValue() + 1);

                    }
                }

            }

        }
    }


}
