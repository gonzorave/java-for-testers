package ru.stqa.geometry.figures;

public class Square {

    public static void printSquareArea(double a) {
        System.out.println("Площадь квадрата со стороной " + a + " = " + getSquareArea(a));
    }

    private static double getSquareArea(double side) {
        return side * side;
    }
}
