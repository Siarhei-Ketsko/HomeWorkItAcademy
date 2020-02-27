package com.homework.lesson4;

public class TimePeriod {
    private int seconds;
    private int minutes;
    private int hours;

    public TimePeriod(int seconds) { // Конструктор принимающий секунды.
        if(seconds >= 0) {
            this.seconds = seconds;
        }
        else {
            this.seconds = 0;
        }
    }

    public TimePeriod(int seconds, int minutes, int hours) { // Конструктор принимаюзий секунды, минуты, часы
        if (seconds >=0) {
            this.seconds = seconds;
        }
        else {
            this.seconds = 0;
        }
        if (minutes >=0) {
            this.minutes = minutes;
        }
        else {
            this.minutes = 0;
        }
        if (hours >=0) {
            this.hours = hours;
        }
        else {
            this.hours = 0;
        }
    }

    public int fullTimeInSeconds() { // Метод получения количества секунд в объекте.

        return seconds = (3600 * hours) + (60 * minutes) + seconds;
    }
    public void convertSecondsToHourMinSec(){ // Метод из секунд в часы минуты секунды
        hours = seconds / 3600;
        minutes = (seconds - hours * 3600) / 60;
        seconds = seconds - (hours * 3600) - (minutes * 60);
    }

    public void printResultSeconds() {
        System.out.println("Отрезок времени = " + seconds + " сек."); // Метод вывода данных в секундах
    }

    public void printResulHoursMinSeconds() {
        System.out.println("Отрезок времени = " + hours + " ч. " + minutes + " мин. " + seconds + " сек."); // Метод вывода часы минуты секунды
    }
}

