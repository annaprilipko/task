package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        ArrayList<String> list = new ArrayList<>();

        String str = s.trim();

        String[] sSplit = str.split("\\s+");

        for( int i = 0; i < sSplit.length; i++){
            char firstLetter = sSplit[i].charAt(0);
            String elseLetters = sSplit[i].substring(1);
            String stringFL = String.valueOf(firstLetter);
            String bigFirstLetter = stringFL.toUpperCase();
            String modWord = bigFirstLetter + elseLetters;
            list.add(modWord);
        }

        String newLine = "";

        for(int i = 0; i < list.size(); i++){
            newLine += list.get(i) + " ";
        }

        System.out.println(newLine);

    }
}
