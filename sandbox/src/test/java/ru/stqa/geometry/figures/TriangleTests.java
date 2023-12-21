package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {
    @Test
    void canCalculateTriangleArea() {
        double res = Triangle.heronsTriangleArea(5., 8., 5);
        Assertions.assertEquals(12.0, res);
    }

    @Test
    void canCalculateTrianglePerimeter() {
    double res = Triangle.getTrianglePerimeter(135., 71., 90. );
    Assertions.assertEquals(296., res);
    }
}
