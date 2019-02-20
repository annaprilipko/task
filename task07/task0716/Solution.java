package com.javarush.task.task07.task0716;

import java.util.ArrayList;
import java.util.*;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); // 0
        list.add("лоза"); // 1
        list.add("лира"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {

        /*Iterator<String> itr = list.iterator();

        while (itr.hasNext()){

            String str = itr.next();

            if(str.indexOf('р') >= 0 && str.indexOf('л') < 0){
                itr.remove();
            }
        }*/

        /*ListIterator<String> itr = list.listIterator();//РАБОЧЕЕ РЕШЕНИЕ

        while (itr.hasNext()){

            String str = itr.next();

            if(str.indexOf('р') >= 0 && str.indexOf('л') < 0){
                itr.remove();
            } else if(str.indexOf('р') < 0 && str.indexOf('л') >= 0){
                itr.add(str);
            }
        }*/


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

        //напишите тут ваш код
        return list2;
    }
}