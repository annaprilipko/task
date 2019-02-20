package com.javarush.task.task03.task0302;


/*
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        int a = Integer.parseInt(sA);
        String sB = reader.readLine();
        int b = Integer.parseInt(sB);
        String sC = reader.readLine();
        int c = Integer.parseInt(sC);

        //int min = a;
        //int max = a;
        int mid;

        //if( a == b && a == c) System.out.println(a);
        //else{


        //if (b < min) min = b;
        //if (c < min) min = c;

        //if (b > max) max = b;
        //if (c > max) max = c;

        //int sum = a + b + c;

        //int mid = sum - min - max;
        //System.out.println(min);
        //System.out.println(max);
        if(a>b){
            if(a>c){
                if(b>c){
                    mid = b;
                } else {
                    mid = c;
                }
            } else {
                mid = a;
            }
        } else {
            if(b>c){
                if(a>c){
                    mid = a;
                } else {
                    mid = c;
                }
            }else{
                mid = b;
            }
        }

        System.out.println(mid);
    }
    //напишите тут ваш код
}
