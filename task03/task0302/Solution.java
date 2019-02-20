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

        int mid;

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
}
