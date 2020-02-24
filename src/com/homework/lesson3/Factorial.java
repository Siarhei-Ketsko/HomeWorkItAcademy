package com.homework.lesson3;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = 1;
        for (int i = 1; i <=x; i++){
            result *= i;
        }
        System.out.println(result);
    }
}


   /* Scanner sc = new Scanner(System.in);
    int y = 1;
    int result = 1;
    int n = 0;
    int m = sc.nextInt();
        while (n<m) {
        result *= y;
        y++;
        n++;
        }
        System.out.println(x);
    */