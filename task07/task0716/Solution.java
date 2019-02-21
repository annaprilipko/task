package com.javarush.task.task07.task0716;

import java.util.ArrayList;
import java.util.*;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза");
        list.add("лоза");
        list.add("лира");
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {


        ArrayList<String> list2 = new ArrayList<>();


        for( int i = 0; i < list.size(); i++){

            if(list.get(i).indexOf('р') >= 0 && list.get(i).indexOf('л') >= 0) {
                list2.add(list.get(i));
            } else if(list.get(i).indexOf('р') < 0 && list.get(i).indexOf('л') >= 0){
                for(int j = 0; j < 2; j++){
                    list2.add(list.get(i));
                }
            }

        }

        return list2;
    }
}