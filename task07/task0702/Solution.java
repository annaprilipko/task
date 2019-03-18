package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] array = new String[10];

        for(int i = 0; i < 8; i++){
            //подозреваю что нам не надо создавать новый ридер каждый раз
            BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
            array[i] = reader.readLine();
        }


        for (int j = array.length-1; j >= 0; j--){
            System.out.println(array[j]);
        }
    }
}
