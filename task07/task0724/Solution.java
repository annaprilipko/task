package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {

        Human grandPa1 = new Human("grandPa1", true, 70);
        Human grandMa1 = new Human("grandMa1", false, 60);

        Human grandPa2 = new Human("grandPa2", true, 77);
        Human grandMa2 = new Human("grandMa2", false, 66);

        Human father = new Human("father", true, 55, grandPa1, grandMa1);
        Human mother = new Human("mother", false, 45, grandPa2, grandMa2);

        Human child1 = new Human("child1", true, 2, father, mother);
        Human child2 = new Human("child2", false, 3, father, mother);
        Human child3 = new Human("child3", true, 5, father, mother);

        System.out.println(grandPa1.toString());
        System.out.println(grandMa1.toString());
        System.out.println(grandPa2.toString());
        System.out.println(grandMa2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());


        // напишите тут ваш код
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        // напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}