package com.homework.lesson15;

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
