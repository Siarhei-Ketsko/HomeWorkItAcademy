package com.homework.lesson2;


import java.util.Scanner;

public class SwitchRubli {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int summa = sc.nextInt();
        int secondLastNumber = summa % 100 / 10; // Получаем предпоследнее число

        if (secondLastNumber == 1) {              // Проверяем предпоследнее число равно ли оно 1.
            System.out.println(summa + " Рублей");
        }
        else {
        switch (summa % 10) {                        // В условии switch получаем последнее число суммы.
            case 1:
                System.out.println(summa + " Рубль");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println(summa + " Рубля");
                break;
            default:
                System.out.println(summa + " Рублей");

            }
        }

    }
}
/*
Вариант с отрицательными числами
if (secondLastNumber == 1 || secondLastNumber == -1) {
    System.out.println(summa + " Рублей");
}
else {
switch (summa % 10) {
    case 1:
        System.out.println(summa + " Рубль");
        break;
    case -1:
        System.out.println(summa + " Рубль");
        break;
    case 2:
    case -2:
        System.out.println(summa + " Рубля");
        break;
    case 3:
    case -3:
        System.out.println(summa + " Рубля");
        break;
    case 4:
        System.out.println(summa + " Рубля");
        break;
    case -4:
        System.out.println(summa + " Рубля");
        break;
    default:
        System.out.println(summa + " Рублей");

    }
}

 */
