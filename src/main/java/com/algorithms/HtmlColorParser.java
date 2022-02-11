package com.algorithms;

import java.util.Map;

public class HtmlColorParser {


    public static void main(String[] args) {

        parse("#80FFA0");
    }
    private final Map<String, String> presetColors;

    public HtmlColorParser(Map<String, String> presetColors) {
        this.presetColors = presetColors;
    }

    public static   RGB parse(String color) {
//        color = "#80FFA0";
        String subColor = color.substring(1, color.length());
        System.out.println(subColor);

        return new RGB(0, 128, 255);
    }

}