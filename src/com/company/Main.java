package com.company;


public class Main {

    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle(4);
        Rectangle rec2 = new Rectangle(4, 5);
        Rectangle rec3 = new Rectangle(4, 6);
        Rectangle recX = new Rectangle(4, 5);

        rec1.printArea();
        rec1.printRectangleKind();
        System.out.println(rec1.isTheSameRectangle(recX));

        rec2.printArea();
        rec2.printRectangleKind();
        System.out.println(rec2.isTheSameRectangle(recX));

        rec3.printArea();
        rec3.printRectangleKind();
        System.out.println(rec3.isTheSameRectangle(recX));
    }
}
