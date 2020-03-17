package com.homework.lesson12;

public class TestPair {

    public static void main(String[] args) {

        Pair <String, Integer> pair1 = new Pair<>("1", 143);
        Pair<Integer, String> pair2 = new Pair<>(100,"2");


        System.out.println(PairUtil.getSwapPair(pair1).getKey());


    }
}
