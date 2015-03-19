package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

import java.util.concurrent.Callable;

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Mouse littleMouse = new Mouse("mi", 8, 4);
        Dog butc = new Dog("butc", 8, "green");
        Cat tom = new Cat("Tom", 8, 'M');

        //Напишите тут ваш код
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public  static  class Dog
    {
        String name;
        int streight;
        String color;

        public Dog(String name, int streight, String color)
        {
            this.name = name;
            this.streight = streight;
            this.color = color;
        }
    }
    public  static  class  Cat
    {
        String name;
        int weight;
        char gender;

        public Cat(String name, int weight, char gender)
        {
            this.name = name;
            this.weight = weight;
            this.gender = gender;
        }
    }


    //Напишите тут ваши классы

}
