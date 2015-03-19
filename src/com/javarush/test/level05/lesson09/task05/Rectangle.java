package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //Напишите тут ваш код
    private int top;
    private int left;
    private int width;
    private int heigt;

    public Rectangle(int top, int left, int width, int heigt)
    {
        this.top = top;
        this.left = left;
        this.width = width;
        this.heigt = heigt;
    }

    public Rectangle(int top, int left)
    {
        this.top = top;
        this.left = left;
        width = 0;
        heigt = 0;
    }

    public Rectangle(int top, int left, int width)
    {
        this.top = top;
        this.left = left;
        this.width = width;
        heigt = width;
    }
    public Rectangle(Rectangle anotheRectangle) {
        this.heigt = anotheRectangle.heigt;
        this.width = anotheRectangle.width;
        this.top = anotheRectangle.top;
        this.left = anotheRectangle.left;
    }
}
