package com.homework.lesson12;

import java.math.BigDecimal;

public class TestPair {

    public static void main(String[] args) {

        Pair<String, Integer> pair1 = new Pair<>("1", 143);

        System.out.println(PairUtil.getSwapPair(pair1).getKey());

        DoubleIntGenerics test = new DoubleIntGenerics();
        System.out.println(test.addition(new BigDecimal("43243243243242442424.42424"), new BigDecimal("1999999999999999999999.42214")));
        System.out.println(test.addition(1, 99999999999L));
        System.out.println(test.addition(2.54, 1));
        System.out.println(test.addition(1, 2));
        System.out.println(test.addition(2.55F, 5.33F));
        System.out.println(test.subtraction(500, 14.5));

    }
}
