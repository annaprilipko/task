package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {

        HashSet<Integer> set = new HashSet<Integer>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        set.add(16);
        set.add(17);
        set.add(18);
        set.add(19);
        set.add(20);

        return set;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {

        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()){
            Integer num = itr.next();
            if(num > 10){
                itr.remove();
            }
        }

       return set;
    }

    public static void main(String[] args) {
        HashSet<Integer> set;
        set = createSet();
        System.out.print(removeAllNumbersGreaterThan10(set));

    }
}
