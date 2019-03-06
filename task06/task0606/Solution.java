package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/
//Что если ввести отрицательное число?
public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum = reader.readLine();
        int sNumLong = sNum.length();
        int num = Integer.parseInt(sNum);

        for(int i = 0; i < sNumLong; i++){
            int a = num%10;
            if( a%2 == 0 ) even++;
            else odd++;
            num /= 10;
        }

        System.out.println("Even: " + even + " Odd: " + odd);

    }
}
