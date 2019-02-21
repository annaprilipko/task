package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList <String> list = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 10; i++){
            list.add(reader.readLine());
        }

        int maxIndex = 0;
        int minIndex = 0;
        int maxLength = list.get(0).length();
        int minLength = list.get(0).length();

        for(int i = 0; i < list.size(); i++){
            if ( list.get(i).length() > maxLength ){
                maxLength = list.get(i).length();
                maxIndex = i;
            }
        }

        for(int i = 0; i < list.size(); i++){
            if ( list.get(i).length() < minLength ){
                minLength = list.get(i).length();
                minIndex = i;
            }
        }

        if( minIndex < maxIndex) System.out.println(list.get(minIndex));
        else System.out.println(list.get(maxIndex));



    }
}
