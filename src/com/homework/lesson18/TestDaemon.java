package com.homework.lesson18;

public class TestDaemon {

    public static void main(String[] args) {

      TenMillionIteration th = new TenMillionIteration();
      DaemonThread dm = new DaemonThread();

      th.start();
      dm.start();

    }

}
