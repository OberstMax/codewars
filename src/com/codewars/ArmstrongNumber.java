package com.codewars;

/*A Narcissistic Number (or Armstrong Number) is a positive number which is the sum of its own digits, each raised to the power of the number of digits in a given base. In this Kata, we will restrict ourselves to decimal (base 10).
For example, take 153 (3 digits), which is narcissistic:
    1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
and 1652 (4 digits), which isn't:
    1^4 + 6^4 + 5^4 + 2^4 = 1 + 1296 + 625 + 16 = 1938
The Challenge:
Your code must return true or false (not 'true' and 'false') depending upon whether the given number is a Narcissistic number in base 10.
This may be True and False.
Error checking for text strings or other invalid inputs is not required, only valid positive non-zero integers will be passed into the function.*/

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


