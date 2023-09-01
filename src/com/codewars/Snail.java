package com.codewars;

import java.util.Arrays;

// https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1/train/java
public class Snail {
    public static int[] snail(int[][] array) {
        int lines = array.length;
        int colum = array[0].length;
        int n = lines * colum;
        int[] newArr = new int[n];
        //движение вправо
        int x = 0;
        //движение вниз
        int y = 0;
        //движение влево
        int x2 = lines-1;
        //движение вверх
        int y2 = colum-1;
        int temp = 0;
        while (temp != n){
            for (int j = y; j < colum-y; j++) {
                newArr[temp] = array[x][j];
                temp++;
                if (temp == n) break;

            } x++;
            for (int i = x; i <=lines-x ; i++) {
                newArr[temp] = array[i][(colum-y-1)];
                temp++;
                if (temp == n) break;
            }y++;
            if (temp == n) break;
            for ( int j = y2-1 ; j >=(colum-y2-1) ; j--) {
                newArr[temp] = array[x2][j];
                temp++;
                if (temp == n) break;
            }x2--;
            //if (temp == n) break;
            for (int i = x2; i >=(lines-x2-1) ; i--) {
                newArr[temp] = array[i][colum-y2-1];
                temp++;
                if (temp == n) break;

            }y2--;

        }

        System.out.println(Arrays.toString(newArr));
        return newArr;
    }

    public static void main(String[] args) {
        Snail snal = new Snail();
        int[][] tt = {{1, 2, 3},
                      {4, 5, 6},
                      {7, 8, 9}};
        int[][] tt2 = {{1, 2, 3, 4},
                      {5, 6, 7, 8},
                      {9, 10, 11, 12}};
        int[][] tt3 = {{1,  2,  3,  4},
                        {5,  6,  7,  8},
                        {9,  10, 11, 12},
                        {13, 14, 15, 16}};
        int[][] tt4 = {{1,  2,  3,  4,  5,  6},
                       {7,  8,  9,  10, 11, 12},
                       {13, 14, 15, 16, 17, 18},
                       {19, 20, 21, 22, 23, 24}};

        snail(tt);
        snail(tt2);
        snail(tt3);
        snail(tt4);
    }
}

/* for array[n*n]
public class Snail {

    public static int[] snail(int[][] array) {
      if (array[0].length == 0) return new int[0];
      int n = array.length;
      int[] answer = new int[n*n];
      int index=0;
      for (int i = 0; i<n/2; i++){
        for (int j = i; j < n-i; j++) answer[index++] = array[i][j];
        for (int j = i+1; j < n-i; j++) answer[index++] = array[j][n-i-1];
        for (int j = i+1; j < n-i; j++) answer[index++] = array[n-i-1][n-j-1];
        for (int j = i+1; j < n-i-1; j++) answer[index++] = array[n-j-1][i];
      }
      if (n%2 != 0) answer[index++] = array[n/2][n/2];
      return answer;
    }
}*/