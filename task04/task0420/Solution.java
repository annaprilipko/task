package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
   public static void main(String[] args) throws Exception {
       /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String sA = reader.readLine();
       int a = Integer.parseInt(sA);
       String sB = reader.readLine();
       int b = Integer.parseInt(sB);
       String sC = reader.readLine();
       int c = Integer.parseInt(sC);

       int min = a;
       int mid = a;
       int max = a;

       //if ( a < b && a < c ) min = a;
       if ( b < min ) min = b;
       if ( c < min ) min = c;
      // else min = c;

       //if ( a > b && a > c ) max = a;
       /*else*/ /*if ( b > max ) max = b;
       if ( c > max ) max = c;
       //else max = c;

       if ( a > min && a < max) mid = a;
       /*else*/ /*if ( b > min && b < max ) mid = b;
       if ( c > min && c < max ) mid = c;*/
      //else mid = c;


      /* if ( a < b ) {
           min = a;
           max = b;
       }
       else {
           min = b;
           max = a;
       }

       if ( c > max) max = c;
       else if ( c < min) min = c;
       else mid = c;*/


       /*System.out.println(max + " " + mid + " " + min);*/
      // Ввод данных с клавиатуры
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String num1 = reader.readLine();
      String num2 = reader.readLine();
      String num3 = reader.readLine();

      // Преобразование строки в число
      int n1 = Integer.parseInt(num1);
      int n2 = Integer.parseInt(num2);
      int n3 = Integer.parseInt(num3);

      // Сортировка введенных чисел
      if (n1 <= n2 && n2 <= n3) System.out.print("\n" + n3 + " " + n2 + " " + n1);
      else if (n1 <= n3 && n3 <= n2) System.out.print("\n" + n2 + " " + n3 + " " + n1);
      else if (n2 <= n1 && n1 <= n3) System.out.print("\n" + n3 + " " + n1 + " " + n2);
      else if (n2 <= n3 && n3 <= n1) System.out.print("\n" + n1 + " " + n3 + " " + n2);
      else if (n3 <= n1 && n1 <= n2) System.out.print("\n" + n2 + " " + n1 + " " + n3);
      else if (n3 <= n2 && n2 <= n1)System.out.print("\n" + n1 + " " + n2 + " " + n3);
   }
}