package com.homework.lesson15;

import java.io.*;

public class MainTestSerialization {

    public static void main(String[] args) {

        Computer pc = new Computer("Asus", "i7-7700k");
        Notebook note = new Notebook("MSI", "i5-5700","superTouch", "TEST");


        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("t.temp")))
        {
           oos.writeObject(pc);
           oos.writeObject(note);
        }

        catch (IOException e) {


        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("t.temp")))
        {
            Computer restorePC = (Computer) ois.readObject();
            System.out.println(restorePC);
            Notebook restoreNote = (Notebook) ois.readObject();
            System.out.println(restoreNote);
        }
        catch (IOException e) {

        }

        catch (ClassNotFoundException e) {

        }

    }

}
