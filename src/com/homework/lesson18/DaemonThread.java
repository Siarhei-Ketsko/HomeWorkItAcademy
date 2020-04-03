package com.homework.lesson18;

public class DaemonThread extends Thread {

    public DaemonThread() {
        setDaemon(true);

    }

    @Override
    public void run() {
        int i = 1;

        for (; i < 10000000; i++) {

            System.out.println(TenMillionIteration.sum + " Thread is daemon?: " + Thread.currentThread().isDaemon());

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
