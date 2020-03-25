package com.homework.lesson15;

import java.io.Serializable;

public class Computer implements Serializable {

    private String motherBoard;
    private String processor;

    public Computer(String motherBoard, String processor) {
        this.motherBoard = motherBoard;
        this.processor = processor;
    }

    @Override
    public String toString(){

        return "Computer: " + "Motherboard -> " + motherBoard + " " + "processor-> " + processor;
    }
}
