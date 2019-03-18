package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        map.put("Stalone", 100);
        map.put("Kapone", 50);
        map.put("Danone", 6000);
        map.put("Varone", 900);
        map.put("Dolce", 1000);
        map.put("Makarone", 300);
        map.put("Gadkijm", 150);
        map.put("Apoek", 700);
        map.put("Ljodm", 600);
        map.put("Qowdsd", 1000);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {

        Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();

        while (itr.hasNext()){
            Map.Entry<String,Integer> pair = itr.next();
            int salary = pair.getValue();
            if(salary < 500) itr.remove();
        }
    }

    public static void main(String[] args) {

    }
}