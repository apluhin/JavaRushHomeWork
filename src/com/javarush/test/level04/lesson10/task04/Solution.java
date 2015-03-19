package com.javarush.test.level04.lesson10.task04;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в одной строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int j = 1, i = 1;
        while ((i == 1 || i == 10) || i < 10) {
            while (j < 11) {
                System.out.print("S");
                j++;
            }
            System.out.println("");
            i++;
            j = 1;
        }

    }
}
