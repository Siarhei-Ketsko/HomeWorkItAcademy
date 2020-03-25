package com.homework.lesson15;

import org.apache.log4j.Logger;

import java.io.File;
import java.util.Date;

/*
 *
 * Вывести список файлов и каталогов выбранного каталога на диске с учетом вложенности директориев.
 * Для этого использовать рекурсию (пример рекурсии тут и тут).
 *
 * */

public class RecursionDirectories {

    public static final Logger LOGGER = Logger.getLogger(ReverseJavaClass.class);

    public static void main(String[] args) {


        File dir = new File(File.separator + "Users" + File.separator + "klaks" + File.separator + "Documents" + File.separator
                + "Java IT-ACADEMY cours" + File.separator + "JD 1 new");

        getDirChild(dir);

    }

    private static void getDirChild(File file) {

        System.out.println(file.getAbsolutePath());

        if (file.isDirectory()) {

            File[] children = file.listFiles();

            for (int i = 0; i < children.length; i++) {
                Date date = new Date(children[i].lastModified());
                System.out.print("\n" + children[i].getPath() + " \t| " + children[i].length() + "\t| " + date.toString());
            }

            for (File child : children) {

                getDirChild(child);

            }
        }

    }

}
