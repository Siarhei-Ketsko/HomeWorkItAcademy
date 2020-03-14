package com.homework.lesson11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchMobileNumber {

    public static void main(String[] args) {
        changeNumber("+375294456998 +375445344343 +375296578898 fsdfsdf");
    }

    public static void changeNumber(String str) {

        Pattern pat = Pattern.compile("(\\+375)([0-9]{2})(\\d{3})(\\d{2})(\\d{2})");
        Matcher matcher = pat.matcher(str);
        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {

            System.out.println(matcher.group(1) + "(" + matcher.group(2) + ")" + matcher.group(3) + "-" + matcher.group(4) + "-" + matcher.group(5));

        }
    }
}
