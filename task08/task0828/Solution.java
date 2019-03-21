package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        HashMap<String, Integer> monthes = new HashMap<String, Integer>();

        monthes.put("January", 1);
        monthes.put("February", 2);
        monthes.put("March", 3);
        monthes.put("April", 4);
        monthes.put("May", 5);
        monthes.put("June", 6);
        monthes.put("July", 7);
        monthes.put("August", 8);
        monthes.put("September", 9);
        monthes.put("October", 10);
        monthes.put("November", 11);
        monthes.put("December", 12);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String month = reader.readLine();

        System.out.println(month + " is the " + monthes.get(month) + " month");
    }
}
