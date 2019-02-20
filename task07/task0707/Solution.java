package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList <String> list = new ArrayList<String>();
        //list.set(1,"a");
        //list.set(2,"b");
        //list.set(3,"c");
        //list.set(4,"d");
        //list.set(5,"e");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        System.out.println(list.size());

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        //напишите тут ваш код
    }
}
