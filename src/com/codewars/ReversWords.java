package com.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReversWords {

    public static String reverseWords(final String original) {

        if (original.trim().length() == 0) return original; //chek String "      "
        if (original.isEmpty()) return original; // chek String ""

        else {
            String[] words = original.split("\\s+"); // created array words without spaces

            Pattern p = Pattern.compile("\\s+");
            Matcher m = p.matcher(original);
            String[] spacers = new String[words.length]; // create array spaces without words
            int k = 0;
            while (m.find()) {
                if (k >= words.length) break;
                spacers[k] = m.group();
                k++;
            }

            ArrayList<String> spacers1 = new ArrayList<>(Arrays.asList(spacers)); // array to ArrayList
            if (spacers1.size() > 0 && words.length >= 1)
                spacers1.remove(spacers1.size() - 1); //deleted last space

            String str = "";
            int i = 0;
            for (String w : words) {
                if (words.length == 1 || i == words.length - 1) {
                    str += new StringBuilder(w).reverse().toString();
                    break;
                }
                str += new StringBuilder(w).reverse().toString() + spacers1.get(i).toString();
                i++;


            }
            return str;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("ehT kciuq nworb xof spmuj revo eht yzal .god"));
        System.out.println(reverseWords("    "));
        System.out.println(reverseWords("a b c d"));
        System.out.println(reverseWords("elbuod   decaps  sdrow"));
        System.out.println(reverseWords("apple"));
        System.out.println(reverseWords(""));


    }
}


