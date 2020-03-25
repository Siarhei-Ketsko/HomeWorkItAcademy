package com.homework.lesson15;

/*
*
* Создать класс Notebook - наследник Computer. В этом классе должно быть поле типа Touchpad - также созданного класса со своими полями. 
* Добавить в класс Notebook transient-поле. Создать объект класса Notebook, сериализовать в файл. --> В классе MainTestSerialization
* Десериализовать объект из файла, продемонстрировать, что transient-поля не сериализуются. --> В классе MainTestSerialization
*
* */

public class Notebook extends Computer {

    private String touchpad;
    private transient String testTransientField;

    public Notebook(String motherBoard, String processor, String touchpad, String test) {
        super(motherBoard, processor);
        this.touchpad = touchpad;
        this.testTransientField = test;
    }

    @Override
    public String toString() {
        return super.toString() + "Touchpad-> " + touchpad + " " + "Transient-> " + testTransientField;
    }
}
