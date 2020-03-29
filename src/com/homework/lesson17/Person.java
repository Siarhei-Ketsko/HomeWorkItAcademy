package com.homework.lesson17;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        Person personOne = new Person("Siarhei", "Ketsko", 55);
        Person personTwo = new Person("Abvgdecgfdsfds", "fsdffsfs", 56);
        Person personThree = new Person("fbas", "ffsf", 58);
        List<Person> persons = new ArrayList<>();


    }



}
