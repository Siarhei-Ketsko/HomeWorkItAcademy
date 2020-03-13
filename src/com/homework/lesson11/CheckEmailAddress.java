package com.homework.lesson11;

public class CheckEmailAddress {

    public static void main(String[] args) {
        System.out.println(checkEmail("dad_@gmail.com"));
    }



    public static boolean checkEmail(String email) {


        return email.matches("");
    }
}
