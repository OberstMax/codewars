package com.codewars;
import java.util.*;

public class CountingDuplicates {


        public static int duplicateCount(String text) {
           int count = 0;
           String text1 = text.toLowerCase();
           char arr [] = text1.toCharArray();
           HashMap<Character, Integer> map = new HashMap<>();


            for (int i = 0; i <= arr.length-1; i++) {
                count = 0;
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) count++;
                    else continue;
                }
                if (count == 0) continue;

                else if (!map.containsKey(arr[i])){
                    count++;
                    map.put(arr[i],count);
                }
                else continue;

            }


            map.remove(map.containsValue(0));
            System.out.println(map);
            return map.size();
        }

    public static void main(String[] args) {
        CountingDuplicates countingDuplicates = new CountingDuplicates();
        System.out.println(countingDuplicates.duplicateCount("kehefhkeDDeEgd"));

    }
}

