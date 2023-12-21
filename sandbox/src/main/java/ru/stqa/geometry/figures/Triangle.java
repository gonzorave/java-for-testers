package ru.stqa.geometry.figures;

public class Triangle {
    public static double getTrianglePerimeter (double sideA, double sideB, double sideC) {
        return (sideA + sideB + sideC);
    }

    public static void printPerimeterResult (double sideA, double sideB, double sideC) {
        var text = String.format("Периметр треугольника со сторонами %f и %f и %f = %f", sideA, sideB, sideC,
                getTrianglePerimeter(sideA, sideB, sideC));
        System.out.println(text);
    }

    public static double heronsTriangleArea(double sideA, double sideB, double sideC) {
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    public static void printTriangleAreaResult(double sideA, double sideB, double sideC) {
        var res = String.format("Площадь треугольника со сторонами %f и %f и %f = %f", sideA, sideB, sideC,
                heronsTriangleArea(sideA, sideB, sideC));
        System.out.println(res);

    }
}
