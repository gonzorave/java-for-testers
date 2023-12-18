package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {
    @Test
    void canCalculateArea() {
        double res = Square.getSquareArea(17.0);
        Assertions.assertEquals(289.0, res);
    }

    @Test
    void canCalculatePerimeter() {
        Assertions.assertEquals(68.0, Square.perimeter(17.0));
    }
}
