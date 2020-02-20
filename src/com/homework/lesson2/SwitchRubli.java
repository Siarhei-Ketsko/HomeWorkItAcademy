package com.homework.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchRubli {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int summa = Integer.parseInt(reader.readLine());
        int secondLastNumber = summa % 100 / 10; // Получаем предпоследнее число

        if (secondLastNumber == 1) {
            System.out.println(summa + " Рублей");
        }
        else {
        switch (summa % 10) {
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
                break;
        }
        }

    }
}
