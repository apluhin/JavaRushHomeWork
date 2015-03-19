package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //Напишите тут ваш код
    private  String name = null;
    private  String adress = null;
    private  int age;
    private  int weight;
    private  String color;




    public void initialize(String name) {
        this.name = name;
    }
    public void initialize(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public void initialize(String name, int weight, String color, String adress) {
        this.name = name;
        adress = null;
        name = null;
        this.weight = weight;
    }
    public  void initialize(String name, String color, String adress) {
        this.adress = adress;
        this.color = color;
        this.name = name;
    }
    public  void initialize(String name, int age) {
        this.age = age;
        this.name = name;
        weight  = 5;
    }

}
