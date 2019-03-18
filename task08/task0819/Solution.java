package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        cats.remove(cats.iterator().next());

        printCats(cats);
    }

    public static Set<Cat> createCats() {

        HashSet<Cat> myCats = new HashSet<Cat>();

        Cat Kat = new Cat();
        Cat Masha = new Cat();
        Cat Dasha = new Cat();

        myCats.add(Kat);
        myCats.add(Masha);
        myCats.add(Dasha);

        return myCats;
    }

    public static void printCats(Set<Cat> cats) {

        for (Cat cat: cats) {
            System.out.println(cat);
        }

    }

    public static class Cat{

    }
}
