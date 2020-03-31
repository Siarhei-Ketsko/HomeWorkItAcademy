package com.homework.lesson18;

public class TenMillionIteration implements Runnable {

    private static long start;
    private static long end;

    private static int sum;

    public static void main(String[] args) {


        Thread thread = new Thread(new TenMillionIteration());
        thread.start();
        Thread thread1 = new Thread(new TenMillionIteration());
        thread1.start();
        Thread thread2 = new Thread(new TenMillionIteration());
        thread2.start();



    }

    @Override
    public void run() {
        for (int i = 0; i < 123; i++) {

            System.out.println(Thread.currentThread().getName() + " " + i);
        }


    }

}

