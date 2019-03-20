package com.javarush.task.task08.task0826;

import org.w3c.dom.stylesheets.LinkStyle;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {

        ArrayList<Integer> newList = new ArrayList<>();

        for(int i = 0; i < array.length; i++){
            newList.add(array[i]);
        }

        //ArrayList<Integer> newList = new ArrayList<>(Arrays.asList(array));// до конца не понимаю почему не работает такой способ перобразования в массив
        //List<Integer> newList = Arrays.asList(array);// до конца не понимаю почему не работает такой способ перобразования в массив
        // из-за того что массив int, а ArrayList Integer???

        Collections.sort(newList);
        Collections.reverse(newList);

        for(int i = 0; i < array.length; i++){
            array[i] = newList.get(i);
        }

    }
}
