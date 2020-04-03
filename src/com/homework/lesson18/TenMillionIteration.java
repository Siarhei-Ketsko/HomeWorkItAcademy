package com.homework.lesson18;

public class TenMillionIteration extends Thread {

   static Long sum = 0L;

    @Override
    public void run() {

        int i = 1;

        for (; i < 10000000; i++) {

            if (!Thread.currentThread().isDaemon()) {

                if (i % 1000000 == 0) {

                  //  System.out.println(i + " sleep " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (i % 2 == 0 && i % 3 == 0) {

                    sum += i;

                }
            }
        }
       // System.out.println(sum);
    }
}





