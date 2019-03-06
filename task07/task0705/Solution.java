package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/
//посмотри пожалуйста на метод System.arraycopy(...) он как раз служит для такой задачи
public class Solution {
    public static void main(String[] args) throws Exception {
        int[] bigArray = new int[20];
        int[] smallArray1 = new int[10];
        int[] smallArray2 = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < bigArray.length; i++){
            bigArray[i] = Integer.parseInt(reader.readLine());
        }

        for( int i = 0; i < smallArray1.length; i++){
            smallArray1[i] = bigArray[i];
        }

        for(int i = 0; i < smallArray2.length; i++){
            smallArray2[i] = bigArray[i+10];
        }

        for(int i = 0; i < smallArray2.length; i++){
            System.out.println(smallArray2[i]);
        }

    }
}
