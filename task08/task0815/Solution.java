package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("Stalone", "Vasia");
        map.put("Kapone", "Katay");
        map.put("Danone", "Den");
        map.put("Varone", "Vasia");
        map.put("Dolce", "Pom");
        map.put("Makarone", "Jom");
        map.put("Gadkijm", "Den");
        map.put("Apoek", "Pom");
        map.put("Ljodm", "Roma");
        map.put("Qowdsd", "Feday");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {

        int countName = 0;

        for (Map.Entry<String,String> pair: map.entrySet()) {
            String mapName = pair.getValue();

            if(mapName == name) countName++;
        }

        return countName;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {

        int countLastName = 0;

        for (Map.Entry<String,String> pair: map.entrySet()) {
            String mapLastName = pair.getKey();

            if(mapLastName == lastName) countLastName++;
        }

        return countLastName;
    }

    public static void main(String[] args) {

    }
}
