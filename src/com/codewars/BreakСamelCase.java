package com.codewars;

import static java.lang.Character.*;

public class BreakСamelCase {
    public static String camelCase(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }
//        if (input.isEmpty()) return "";
//
//        StringBuilder output = new StringBuilder();
//        char[] toChArr = input.toCharArray();
//        output.append(toChArr[0]);
//        for (int i = 1; i < toChArr.length; i++) {
//            if (toChArr[i] == ' ') output.append(' ');
//            if (Character.isLowerCase(toChArr[i])) output.append(toChArr[i]);
//            else if (Character.isUpperCase(toChArr[i])) output.append(' ').append(toChArr[i]);
//        }
//
//        return output.toString();
   // }


    public static void main(String[] args) {
        System.out.println(BreakСamelCase.camelCase(" camelCasing"));
        System.out.println(BreakСamelCase.camelCase("camelCasingTest"));
        System.out.println(BreakСamelCase.camelCase("     "));
        System.out.println(BreakСamelCase.camelCase(""));
        System.out.println(BreakСamelCase.camelCase("CAmelcasingtest"));
    }
}