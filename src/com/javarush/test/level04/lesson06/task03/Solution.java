package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String a2 = reader.readLine();
        String a3 = reader.readLine();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(a2);
        int c = Integer.parseInt(a3);
        if (a > b)
        {
            if (b > c)
            {
                System.out.print(a + " " + b + " " + c);
            }
            else {
                System.out.print(a + " " + c + " " + b);
            }
        }
        else if (b > c) {
            if (c > a) {
                System.out.print(b + " " + c + " " + a);
            }
            else {
                System.out.print(b + " " + a + " " + c);
            }
        }
        else {
            if (b > a) {
                System.out.print(c + " " + b + " " + a);
            }
            else {
                System.out.print(c + " " + a + " " + b);
            }
        }
    }


    }

