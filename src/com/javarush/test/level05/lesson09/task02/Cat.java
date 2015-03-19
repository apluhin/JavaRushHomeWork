package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //Напишите тут ваш код
    private String name;
    private int weigth;
    private int age;
    private String adress;
    private String color;

    public Cat(String name)
    {
        this.name = name;
    }

    public Cat(String name, int weigth, int age)
    {
        this.name = name;
        this.weigth = weigth;
        this.age = age;
    }

    public Cat(int weigth, String color)
    {
        this.weigth = weigth;
        this.color = color;
        adress = null;
        name = null;
        age = 5;

    }

    public Cat(int weigth, String adress, String color)
    {
        this.weigth = weigth;
        this.adress = adress;
        this.color = color;
    }
    public  Cat(String name, int age) {
        this.name = name;
        this.age = age;
        weigth = 5;
    }

}
