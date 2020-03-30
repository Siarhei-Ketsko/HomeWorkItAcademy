package com.homework.lesson17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Person {

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

        persons.stream()
                .filter(x -> x.getFirstName().length() + x.getLastName().length() <= 15)
                .max(Comparator.comparingInt(Person::getAge))
                .ifPresent(person -> System.out.println(person.getFirstName() + " " + person.getLastName()));

    }

}
