package com.homework.lesson11;

public class SearchParagraphTags {

    public static void main(String[] args) {
        changeParagraphTags("<p id =\"p1\">Первый абзац текста тестируем</p> <p id =\"p1\"> Второй тест абзаца текста </p>");
        changeParagraphTags("<p align=?>Тест абзаца</p> <p align=?> Тест абзаца </p>");
        changeParagraphTags("<pre>Тест</pre> <pre> Тест </pre>");
    }

    public static void changeParagraphTags(String str) {
        System.out.println(str.replaceAll("(\\<p\\s(/?[^\\>]+)\\>)\\w?","<p>"));
    }
}
