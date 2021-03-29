package com.company;

public class Rectangle {

    public double x;
    public double y;


    Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Rectangle(double x) {
        this.x = x;
        this.y = x;
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


}
