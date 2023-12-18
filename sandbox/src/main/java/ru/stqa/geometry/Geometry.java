package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea(9.0);
        Square.printSquareArea(13);
        Square.printSquareArea(2);

        Rectangle.printRectangleArea(3.0, 5.0);
    }
}
