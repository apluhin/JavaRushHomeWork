package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String b1 = reader.readLine();
        String c1 = reader.readLine();
        String d1 = reader.readLine();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);
        int d = Integer.parseInt(d1);
        int m1;
        int m2;
        if (a > b) {
            m1 = a;
        }
        else {
            m1 = b;
        }
        if (c > d) {
        m2 = c;
        }
         else {
        m2 = d;
    }
        if (m1 > m2) {
            System.out.print(m1);
        }
        else {
            System.out.print(m2);
        }

    }



}
