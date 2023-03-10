package com.codewars;

public class RgbToHex {

    public static String rgb(int r, int g, int b) {
        if (r<0) r=0;
        if (g<0) g=0;
        if (b<0) b=0;
        if (r>255) r=255;
        if (g>255) g=255;
        if (b>255) b=255;
        String a = Integer.toHexString(r).toUpperCase();
        String d = Integer.toHexString(g).toUpperCase();
        String c = Integer.toHexString(b).toUpperCase();

        if (r<16 && g<16 && b<16) return (""+0+a.toString()+0+d.toString()+0+c.toString());
        if (r<16 && g<16) return (""+0+a.toString()+0+d.toString()+c.toString());
        if (r<16 && b<16) return (""+0+a.toString()+d.toString()+0+c.toString());
        if (g<16 && b<16) return (""+a.toString()+0+d.toString()+0+c.toString());
        if (r<16) return (""+0+a.toString()+d.toString()+c.toString());
        if (g<16) return (""+a.toString()+0+d.toString()+c.toString());
        if (b<16) return (""+a.toString()+d.toString()+0+c.toString());

        else return (""+a.toString()+d.toString()+c.toString());
    }

    public static void main(String[] args) {
        System.out.println(RgbToHex.rgb(-20, 300, 11));
    }
}
