package com.javarush.task.task05.task0532;

import java.io.*;

import static java.lang.System.*;

/*
Задача по алгоритмам
*/
//Что будет выведено если первое число 0?
//что будет выведено если первое число -1?
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int maximum = 0;

        if(n < 0) {
            System.out.println("Error");

        } else {
                int num = Integer.parseInt(reader.readLine());
                maximum = num;
                for( int i = 0; i < n-1; i++){
                    int num1 = Integer.parseInt(reader.readLine());
                    if (num1 > maximum) maximum = num1;
                }
        }
        System.out.println(maximum);


    }
}
