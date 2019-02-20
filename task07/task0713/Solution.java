package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> listMain = new ArrayList<>();
        ArrayList<Integer> listThree = new ArrayList<>();
        ArrayList<Integer> listTwo = new ArrayList<>();
        ArrayList<Integer> listElse = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 20; i++){
            listMain.add(Integer.parseInt(reader.readLine()));
        }

        for(int i = 0; i < listMain.size(); i++){
            if(listMain.get(i) % 2 == 0)listTwo.add(listMain.get(i));
            if(listMain.get(i) % 3 == 0)listThree.add(listMain.get(i));
            if(listMain.get(i) % 2 != 0 && listMain.get(i) % 3 != 0)listElse.add(listMain.get(i));
        }

        printList(listThree);
        printList(listTwo);
        printList(listElse);
        //напишите тут ваш код
    }

    public static void printList(List<Integer> list) {

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        //напишите тут ваш код
    }
}
