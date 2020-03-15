package com.homework.lesson11;

public class SearchMobileNumber {

    public static void main(String[] args) {

        System.out.println(changeNumber("+375294456998 +375445344343 +375296578898 fsdfsdf 80297568375"));

    }

    public static String changeNumber(String str) {

      return  String.valueOf(str).replaceAll("(\\+375)([0-9]{2})(\\d{3})(\\d{2})(\\d{2})","$1($2)-$3-$4-$5");

    }
}
