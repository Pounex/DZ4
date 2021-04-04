package com.company;

public class Rectangle {

    public double x;
    public double y;
    private static int createdRectangles = 0;
    private static final String RUSSIAN_CLASS_NAME = "Прямоугольник";
    private static final String ENGLISH_CLASS_NAME = "Rectangle";

    Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
        createdRectangles++;
    }

    Rectangle(double x) {
        this.x = x;
        this.y = x;
        createdRectangles++;
    }

    double calculateArea() {
        return this.x * this.y;
    }

    void printArea() {
        System.out.println(calculateArea());
    }

    void printRectangleKind() {
        if (this.x == this.y) {
            System.out.println("Это квадрат");
        } else {
            System.out.println("Это прямоугольник");
        }
    }

    boolean isTheSameRectangle(Rectangle recX) {
        return this.x == recX.x && this.y == recX.y;

    }
    //////////////////////////////////////////////////////

    static void printRectanglesCount() {
        if (createdRectangles / 10 == 1) {
            System.out.println("Всего было создано " + createdRectangles + " прямоугольников");
        } else if (createdRectangles % 10 == 1) {
            System.out.println("Всего было создано " + createdRectangles + " прямоугольник");
        } else if (createdRectangles % 10 > 1 && createdRectangles % 10 < 5) {
            System.out.println("Всего было создано " + createdRectangles + " прямоугольника");
        } else if ((createdRectangles % 10 > 4 && createdRectangles % 10 < 10) || (createdRectangles == 0)) {
            System.out.println("Всего было создано " + createdRectangles + " прямоугольников");
        }

    }

    static void printClassName(boolean printRussian) {
        if (printRussian)
            System.out.println(RUSSIAN_CLASS_NAME);

        else System.out.println(ENGLISH_CLASS_NAME);

    }


}
