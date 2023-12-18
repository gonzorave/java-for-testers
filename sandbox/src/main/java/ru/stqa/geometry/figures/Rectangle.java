package ru.stqa.geometry.figures;

public class Rectangle {

   public static void printRectangleArea(double side1, double side2) {
       var text = String.format("Площадь прямоугольника со сторонами %f и %f = %f", side1, side2,getRectangleArea(side1, side2));
       System.out.println(text);
    }

    private static double getRectangleArea(double side1, double side2) {
        return (side1 * side2);
    }
}
