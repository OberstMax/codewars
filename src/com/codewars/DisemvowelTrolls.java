package com.codewars;

public class DisemvowelTrolls {
    /*Trolls are attacking your comment section!
A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
Your task is to write a function that takes a string and return a new string with all vowels removed.
For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
Note: for this kata y isn't considered a vowel. */
    public static String disemvowel(String str) {
        String[] aoe = {"a","o","i","u","e","O","I","U","E","A"};
        for (int i = 0; i < aoe.length; i++) {
            str = str.replace(aoe[i], "");
        }
        return str;
    }
}
