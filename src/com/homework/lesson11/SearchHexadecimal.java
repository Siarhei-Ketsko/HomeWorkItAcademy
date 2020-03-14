package com.homework.lesson11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchHexadecimal {

    public static void main(String[] args) {
        searchHex(" река рак 0x7 Gdfd 1x7fff борт лодка 0x7FFF");
    }

    public static void searchHex(String str) {
        Pattern pat = Pattern.compile("(\\b0x[A-Fa-f0-9]{1,4}\\b)");
        Matcher matcher = pat.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}