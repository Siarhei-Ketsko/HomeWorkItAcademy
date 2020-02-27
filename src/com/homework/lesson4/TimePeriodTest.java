package com.homework.lesson4;

import java.util.Scanner;

public class TimePeriodTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите вермя первого отрезка в секундах");
        TimePeriod time = new TimePeriod(sc.nextInt());
        System.out.println("Введите время второго отрезка через пробел в \"секунд\" \"минут\" \"часов\"");
        TimePeriod timeTwo = new TimePeriod(sc.nextInt(),sc.nextInt(),sc.nextInt());
        System.out.println("Введите \"1\" Если хотите преобразовать отрезок времени первого объекта из секунд в \"Часы\" \"Минуты\" \"Секунды\"");
        System.out.println("Введите \"2\" Если хотите преобразовать отрезок времени второго объекта в секунды");
        System.out.println("Введите \"3\" Если хотите вывести отрезок времени второго объекта в формате \"Часы\" \"Минуты\" \"Секунды\"");
        System.out.println("Для выхода введите любое число > 3 и < 1");
            int menu = sc.nextInt();
            if (menu == 1) {
                time.convertSecondsToHourMinSec();
                time.printResulHoursMinSeconds();
            }
            else if (menu == 2) {
                timeTwo.fullTimeInSeconds();
                timeTwo.printResultSeconds();
            }
            else if (menu == 3) {
                timeTwo.printResulHoursMinSeconds();
            }
    }
}
