package com.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class SquareEveryDigit {
    public void squareDigits(int n) {

        int temp;
        ArrayList<Integer> list = new ArrayList<>();
        while (true){
            if (n == 0) {
                temp = n % 10;
                list.add(temp*temp);
                break;}
            temp = n % 10;
            list.add(temp*temp);

            n = n/10;
        }
        StringBuilder str = new StringBuilder();
        for (int i = list.size()-1; i >= 0 ; i--) {
            str.append(list.get(i).toString()) ;
        }
        //System.out.println(str);
        temp = Integer.parseInt(String.valueOf(str));
        System.out.println(temp);


    }
    public static void main(String[] args) {
        SquareEveryDigit sq = new SquareEveryDigit();
        sq.squareDigits(9119);
        sq.squareDigits(0);
    }
}
