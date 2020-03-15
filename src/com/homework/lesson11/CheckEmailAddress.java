package com.homework.lesson11;

import java.util.Scanner;

public class CheckEmailAddress {

    public static void main(String[] args) {

        if(checkEmail("da123_d_@gmail.com")) {

            System.out.println("Email введен правильно");
        }
        else {
            System.out.println("Email введен некорректно");
        }
    }

    public static boolean checkEmail(String email) {

        return email.matches("[a-zA-Z]\\w+@[a-zA-Z]+?\\.(com|org)");
    }
}
