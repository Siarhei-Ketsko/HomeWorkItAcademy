package com.homework.lesson13;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTestStack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Введите размер стека");
        CustomStack stack = new CustomStack(sc.nextInt());


        System.out.println("Введите число");
        ArrayList<Integer> addToStack = new ArrayList<>(StackUtils.getNumbers(sc.next())); // Парсим строку в лист

        for (int i = 0; i < addToStack.size(); i++) {

            stack.push(addToStack.get(i));
        }

        System.out.println("Достали из стека: " + stack.pop());

        System.out.println("Добвить в стек - ведите цифру: ");
        stack.push(sc.nextInt());

        System.out.println("Вывести в обратном порядке");
        stack.printStack();

    }
}
