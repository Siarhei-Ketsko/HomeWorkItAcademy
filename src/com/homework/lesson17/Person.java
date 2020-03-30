package com.homework.lesson17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
*
* Дан класс Person с полями firstName, lastName, age.
* Вывести полное имя самого старшего человека, у которого длина этого имени не превышает 15 символов.
*
* */

public class Person {

    private static long start;
    private static long end;

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("Siarhei", "Ketsko", 55),
                new Person("Siarheisiarhe", "KetskoKetsko", 66),
                new Person("Alexandr", "Boiko", 58));

        start = System.currentTimeMillis();

        persons.stream()
                .filter(person -> person.getFirstName().length() + person.getLastName().length() <= 15)
                .max(Comparator.comparingInt(Person::getAge))
                .ifPresent(person -> System.out.println(person.getFirstName() + " " + person.getLastName()));

        end = System.currentTimeMillis() - start;

        System.out.println(" v1 " + end + " ms");

        start = System.currentTimeMillis();

      String result =  persons.stream()
                .filter(person -> person.getFirstName().length() + person.getLastName().length() <= 15)
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .map(person -> person.getFirstName() + " " + person.getLastName())
                .findFirst()
                .orElse("");

        end = System.currentTimeMillis() - start;
                                                 
        System.out.println(result + "\n" + " v2 " + end + " ms");

    }

}
