package com.homework.lesson11;

public class SearchParagraphTags {

    public static void main(String[] args) {
        changeParagraphTags("fsff <p id =\"p1\"><p id =\"p1\"> < p id =\"p1\">  <body> </body> gddgdf<p id =\"p1\"> <p id =\"p1\">");
    }

    public static void changeParagraphTags(String str) {
        System.out.println(str.replaceAll("(\\<\\s?p(/?[^\\>]+)\\\">)", "<p>"));
    }
}
