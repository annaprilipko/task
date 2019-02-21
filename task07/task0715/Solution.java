package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();

        String str1 = "мама";
        String str2 = "мыла";
        String str3 = "раму";

        list.add(str1);
        list.add(str2);
        list.add(str3);

        list.add(1,"именно");
        list.add(3,"именно");
        list.add(5,"именно");

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
