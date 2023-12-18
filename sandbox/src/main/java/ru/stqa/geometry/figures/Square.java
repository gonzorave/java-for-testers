package ru.stqa.geometry.figures;

public class Square {

    public static void printSquareArea(double a) {
        String text = String.format("Площадь квадрата со стороной %f = %f", a, getSquareArea(a));
        System.out.println(text);
    }

    public static double getSquareArea(double side) {
        return side * side;
    }

    public static double perimeter(double a) {
        return 4 * a;
    }
}
