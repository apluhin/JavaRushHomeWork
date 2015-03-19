package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String name = null;
    private String color = null;
    private int growth;
    //Напишите тут ваш код
    public void initialize(String name) {
        this.name = name;
    }
       public void  initialize(String name, String color) {
        this.color = color;
        this.name = name;
    }
    public void  initialize(String name, String color, int growth) {
        this.color = color;
        this.name = name;
        this.growth = growth;
    }


}
