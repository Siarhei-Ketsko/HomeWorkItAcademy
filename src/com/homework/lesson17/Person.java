package com.homework.lesson17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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

        Person personOne = new Person("Siarhei", "Ketsko", 55);
        Person personTwo = new Person("Siarheisiarhe", "KetskoKetsko", 66);
        Person personThree = new Person("Alexandr", "Boiko", 58);
        List<Person> persons = new ArrayList<>();

        persons.add(personOne);
        persons.add(personTwo);
        persons.add(personThree);

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
