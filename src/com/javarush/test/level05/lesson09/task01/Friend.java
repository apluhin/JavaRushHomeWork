package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //Напишите тут ваш код
    private String name;
    private  int age;
    private  char gender;

    public Friend(String name) {
        this.name = name;
    }

    public Friend(char gender, String name, int age)
    {
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    public Friend(int age, String name)
    {
        this.age = age;
        this.name = name;
    }
}