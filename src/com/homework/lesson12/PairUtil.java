package com.homework.lesson12;

public final class PairUtil {

    public static  <K, V> Pair<V, K> getSwapPair(Pair<K, V> pairToSwap){
        return new Pair<>(pairToSwap.getValue(), pairToSwap.getKey());
    }
}
