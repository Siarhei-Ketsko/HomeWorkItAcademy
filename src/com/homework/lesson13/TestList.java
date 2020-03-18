package com.homework.lesson13;

import java.util.ArrayList;

public class TestList {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(50);

        Student siarheiKetsko = new Student("Сергей", "Кецко", new ArrayList<>(100));
        Student evgeniZelenkevich = new Student("Евгений", "Зеленкевич", new ArrayList<>(100));
        Student igorBoiko = new Student("Бойко", "Игорь",new ArrayList<>(100));
        students.add(siarheiKetsko);
        students.add(evgeniZelenkevich);
        students.add(igorBoiko);




        StudentListUtils.setScores(igorBoiko, igorBoiko.getScores());
        StudentListUtils.setScores(siarheiKetsko, siarheiKetsko.getScores());
        StudentListUtils.setScores(evgeniZelenkevich, evgeniZelenkevich.getScores());

      //  System.out.println(siarheiKetsko.getScores());
     //   System.out.println(evgeniZelenkevich.getScores());

        StudentListUtils.delBadScores(siarheiKetsko.getScores());
      //  StudentListUtils.printStudentsRevers(students);


      StudentListUtils.printScores(siarheiKetsko,siarheiKetsko.getScores());
        //System.out.println(evgeniZelenkevich.getScores());





    }

}
