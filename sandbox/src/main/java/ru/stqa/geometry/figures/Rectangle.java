package ru.stqa.geometry.figures;

public class Rectangle {

   public static void printRectangleArea(double side1, double side2) {
        System.out.println("Площадь прямоугольника со сторонами " + side1 + " и " + side2 + " = " + getRectangleArea(side1, side2));
    }

    private static double getRectangleArea(double side1, double side2) {
        return (side1 * side2);
    }
}
