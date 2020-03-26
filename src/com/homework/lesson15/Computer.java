package com.homework.lesson15;

import java.io.Serializable;

/*
*
* Создать класс Computer. Добавить ему несколько полей, создать объект этого класса, сериализовать в файл.
* Десериализовать объект из того же файла, вывести значения полей в консоль. --> В классе MainTestSerialization
*
* */


public class Computer implements Serializable {

    private String motherBoard;
    private String processor;

    public Computer(String motherBoard, String processor) {
        this.motherBoard = motherBoard;
        this.processor = processor;
    }

    @Override
    public String toString(){

        return "Computer: " + "Motherboard -> " + motherBoard + " | " + "processor-> " + processor;
    }
}
