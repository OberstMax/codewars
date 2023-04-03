package com.codewars;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

    public static String toRoman(int n) {
       String[] m = {"", "M", "MM", "MMM"};
       String[] c = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
       String[] x = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
       String[] i = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        if (n<1 || n>3999) return "";
        String str = new String();
           str += m[n/1000] +
                 c[(n%1000) / 100] +
                 x[(n%100) / 10] +
                 i[n%10];


        return str;
    }

    public static int fromRoman(String romanNumeral) {
        Map<Character, Integer> map = new HashMap<>();
        {   map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);}

        int result = 0;
        for (int i = 0; i < romanNumeral.length(); i++) {
            if (i>0 && map.get(romanNumeral.charAt(i)) > map.get(romanNumeral.charAt(i-1))){
                result += map.get(romanNumeral.charAt(i)) - 2*map.get(romanNumeral.charAt(i-1));
            }else result += map.get(romanNumeral.charAt(i));

        }
        return result;
    }

    public static void main(String[] args) {
        //RomanNumerals romanNumerals = new RomanNumerals();
        System.out.println(toRoman(3495));
        System.out.println(fromRoman("XCIX"));
    }
}
