package com.homework.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rubli {
    public static void main(String [] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int summa = Integer.parseInt(reader.readLine());
        int secondLastNumber = summa % 100 / 10; // Получаем предпоследнее число

        if (secondLastNumber == 1) {
            System.out.println(summa + " Рублей");
        }
        else if (summa % 10 >=2 && summa % 10 <=4) {
            System.out.println(summa + " Рубля");
        }

        else  if (summa == 1) {
            System.out.println(summa + " Рубль");
        }
        else System.out.println(summa + " Рублей");

    }

}
