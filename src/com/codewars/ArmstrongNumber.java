package com.codewars;

import java.util.ArrayList;

public class ArmstrongNumber {

    public boolean armNum(int number){
        int n = number;
        int count = 0;
        while (n != 0){
            n = n / 10;
            count++;
        }
        int sum = 0;
        int temp = 0;
        int num1 = number;
        int temp1 = 0;
        while (true){
            if (num1 == 0) break;
            temp = 0;
            temp1 = num1 % 10;
            temp = (int) Math.pow(temp1,count);
            sum += temp;
            num1 = num1 / 10;

        }
            if (sum == number) {
                return true;
            } else return false;
    }

    public static void main(String[] args) {
        ArmstrongNumber armstrongNumber = new ArmstrongNumber();
        System.out.println(armstrongNumber.armNum(163));
    }
}


