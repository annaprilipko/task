package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Madonna", df.parse("JANUARY 1 1980"));
        map.put("Elvis", df.parse("MARCH 1 1980"));
        map.put("Kayily", df.parse("AUGUST 1 1980"));
        map.put("Eminem", df.parse("OCTOBER 1 1980"));
        map.put("Quin", df.parse("APRIL 1 1980"));
        map.put("Martin", df.parse("NOVEMBER 1 1980"));
        map.put("Stive", df.parse("JUNE 1 1980"));
        map.put("Kapone", df.parse("JULY 1 1980"));
        map.put("Shakira", df.parse("DECEMBER 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        Iterator<Map.Entry<String, Date>> itr = map.entrySet().iterator();

        while(itr.hasNext()){
            Map.Entry<String, Date> pair = itr.next();
            String name = pair.getKey();
            String stringDate = pair.getValue().toString();

            if(stringDate.contains("Ju") || stringDate.contains("Au")){
                itr.remove();
            }
        }

    }

    public static void main(String[] args) {


    }
}
