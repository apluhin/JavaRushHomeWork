package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String b1 = reader.readLine();
        String c1 = reader.readLine();
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);
        if ((a > b && a < c) || (a < b && a > c)) {
            System.out.print(a);
        }
        else  if ((b >  a && b < c) || (a > b && b > c)) {
            System.out.print(b);
        }
        else if ((c > a && c < b) || (c < a && c > b)) {
            System.out.print(c);
        }
    }

    }

