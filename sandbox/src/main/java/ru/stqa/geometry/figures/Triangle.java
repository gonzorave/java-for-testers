package ru.stqa.geometry.figures;

public class Triangle {
    public static double getTrianglePerimeter(double sideA, double sideB, double sideC) {
        return (sideA + sideB + sideC);
    }

    public static void printResult(double sideA, double sideB, double sideC) {
        var text = String.format("Площадь треугольника со сторонами %f и %f и %f = %f", sideA, sideB, sideC,
                getTrianglePerimeter(sideA, sideB, sideC));
        System.out.println(text);
    }
}
