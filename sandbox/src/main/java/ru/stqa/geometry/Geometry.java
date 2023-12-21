package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;
import ru.stqa.geometry.figures.Triangle;

public class Geometry {
    public static void main(String[] args) {
       /* Square.printSquareArea(9.0);
        Square.printSquarePerimeter(5.);
        Rectangle.printRectangleArea(50., 14.); */
        Triangle.printPerimeterResult(3., 4., 5.);
        Triangle.printTriangleAreaResult(3., 4., 5.);
    }
}
