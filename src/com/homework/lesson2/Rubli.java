package com.homework.lesson2;

import java.util.Scanner;

public class Rubli {
    public static void main(String [] args)  {
        Scanner sc = new Scanner(System.in);
        int summa = sc.nextInt();
        int secondLastNumber = summa % 100 / 10; // Получаем предпоследнее число

        if (secondLastNumber == 1) {              // Проверяем предпоследнее число равно ли оно 1.
            System.out.println(summa + " Рублей");
        }
        else if (summa % 10 >= 2 && summa % 10 <= 4) {
            System.out.println(summa + " Рубля");
        }

        else  if (summa == 1) {
            System.out.println(summa + " Рубль");
        }
        else System.out.println(summa + " Рублей");

    }

}
