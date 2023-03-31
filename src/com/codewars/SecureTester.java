package com.codewars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*In this example you have to validate if a user input string is alphanumeric.
The given string is not nil/null/NULL/None, so you don't have to check that.
The string has the following conditions to be alphanumeric:
At least one character ("" is not valid)
Allowed characters are uppercase / lowercase latin letters and digits from 0 to 9
No whitespaces / underscore*/

public class SecureTester {
    public static boolean alphanumeric(String s){
        Pattern p = Pattern.compile("\\W");
        Matcher m = p.matcher(s);
        if (m.find() || s.contains("_") || s.isEmpty()) return false;
        else return true;
    }
}
