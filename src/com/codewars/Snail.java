package com.codewars;
// https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1/train/java
public class Snail {
    public static int[] snail(int[][] array) {
        int lines = array.length;
        int colum = array[0].length;
        int n = lines * colum;
        int[] newArr = new int[n];
        int x = 0;
        int y = 0;
        int temp = 0;
        while (temp<=n){
            for (int j = (colum-(colum-y))/2; j <= colum-y-1; j++) {
                newArr[temp] = array[((lines-(lines-x))/2)][j];
                temp++;
            } x++;

            for (int i = lines-(lines-x); i <=lines-x ; i++) {
                newArr[temp] = array[i][(colum-y-1)];
                temp++;
            }y++;
            for ( int j = colum-y-1 ; j >=((colum-y)/2)-1 ; j--) {
                newArr[temp] = array[lines-x][j];
                temp++;
            }x++;
            for (int i = lines-x; i >(lines-x)/2 ; i--) {
                newArr[temp] = array[i][(colum-(colum-y)-1)];
                temp++;
            }y++;

        }


        System.out.println(newArr);
        return newArr;
    }

    public static void main(String[] args) {
        Snail snal = new Snail();
//        int[][] tt = {{1, 2, 3},
//                      {4, 5, 6},
//                      {7, 8, 9}};
//        int[][] tt = {{1, 2, 3, 4},
//                      {5, 6, 7, 8},
//                      {9, 10, 11, 12}};
          int[][] tt = {{1,  2,  3,  4},
                        {5,  6,  7,  8},
                        {9,  10, 11, 12},
                        {13, 14, 15, 16}};
        snail(tt);
    }
}
