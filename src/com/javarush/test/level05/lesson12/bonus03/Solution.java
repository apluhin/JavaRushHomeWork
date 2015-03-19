package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int N = Integer.parseInt(s);
        int maximum;
        int a;
        String a2 = reader.readLine();
        maximum = Integer.parseInt(a2);

        for (int i = 0; i < (N-1); i++)
        {
            String a1 = reader.readLine();
             a = Integer.parseInt(a1);

            if (a > maximum)
            {
                maximum = a;
            } else
            {
                maximum = maximum;
            }
        }
        //напишите здесь ваш код


        System.out.println(maximum);

    }
}
