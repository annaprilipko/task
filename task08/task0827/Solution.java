package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {

        Date startDate = new Date(date);

        Date startYear = new Date();
        startYear.setHours(0);
        startYear.setMinutes(0);
        startYear.setSeconds(0);

        startYear.setDate(1);
        startYear.setMonth(0);
        startYear.setYear(startDate.getYear());

        long dayAfterStartYearMS = startDate.getTime() - startYear.getTime();
        long msDay = 24 * 60 * 60 * 1000;

        int dayAfterStartYearDays = (int) (dayAfterStartYearMS / msDay);

        boolean result = false;

        if(dayAfterStartYearDays % 2 == 1) result = true;

        return result;
    }
}
