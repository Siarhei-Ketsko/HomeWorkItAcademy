package com.homework.lesson13;

import java.util.ArrayList;

public class TestList {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(50);

        Student siarheiKetsko = new Student("Сергей", "Кецко", new ArrayList<>(100));
        Student evgeniZelenkevich = new Student("Евгений", "Зеленкевич", new ArrayList<>(100));
        Student igorBoiko = new Student("Бойко", "Игорь", new ArrayList<>(100));
        students.add(siarheiKetsko);
        students.add(evgeniZelenkevich);
        students.add(igorBoiko);

        StudentListUtils.setScores(siarheiKetsko.getScores()); // Заполняем оценки

        System.out.println("Начальные оценки: " + siarheiKetsko.getScores());

        StudentListUtils.delBadScores(siarheiKetsko.getScores()); // Удаляем плохие оценки

        StudentListUtils.printScores(siarheiKetsko, siarheiKetsko.getScores()); // Получаем список оценок

        StudentListUtils.searchMaxScore(siarheiKetsko.getScores()); // Находим самую высокую оценку

        StudentListUtils.printStudentsRevers(students); // Выводим учеников из списка в обратном порядке

        StudentListUtils.printStudentsReversTwo(students); // Выводим учеников из списка в обратном порядке вариант 2

    }

}
