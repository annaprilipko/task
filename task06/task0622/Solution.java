package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < arr.length; i++){

            int min = arr[i];
            int minIndex = i;

            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if( i != minIndex){
                int n = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = n;
            }

        }

        for( int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
