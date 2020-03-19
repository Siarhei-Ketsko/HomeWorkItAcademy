package com.homework.lesson13;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Введите размер стека");
        CustomStack stack = new CustomStack(new ArrayList<>(sc.nextInt()));

        System.out.println("Введите число");
        StackUtils.addNumber(stack.getStk(),sc.next());


        StackUtils.pop(stack.getStk());

        System.out.println("Введите цифру");
        StackUtils.push(stack.getStk(),sc.next());



        StackUtils.printReversNumber(stack.getStk());



    }
}
