package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        Human child1 = new Human("Jone", true, 5);
        Human child2 = new Human("Kate", false, 3);
        Human child3 = new Human("Mike", true, 10);
        Human father = new Human("Misha", true, 35);
        Human mother = new Human("Ksenia", false, 30);
        Human grandPa1 = new Human("Vasia", true, 78);
        Human grandPa2 = new Human("Petia", true, 85);
        Human grandMa1 = new Human("Dasha", false, 65);
        Human grandMa2 = new Human("Masha", false, 55);

        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);

        mother.children.add(child1);
        mother.children.add(child2);
        mother.children.add(child3);

        grandPa1.children.add(father);
        grandMa1.children.add(father);

        grandPa2.children.add(mother);
        grandMa2.children.add(mother);

        System.out.println(grandPa1.toString());
        System.out.println(grandMa1.toString());

        System.out.println(grandPa2.toString());
        System.out.println(grandMa2.toString());

        System.out.println(father.toString());
        System.out.println(mother.toString());

        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());

    }

    public static class Human {

        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
