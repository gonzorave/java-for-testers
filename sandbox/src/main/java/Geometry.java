public class Geometry {
    public static void main(String[] args) {
        printSquareArea(9.0);
        printSquareArea(13);
        printSquareArea(2);

        printRectangleArea(3.0, 5.0);
    }

    private static void printRectangleArea(double side1, double side2) {
        System.out.println("Площадь прямоугольника со сторонами " + side1 + " и " + side2 + " = " + getRectangleArea(side1, side2));
    }

    private static double getRectangleArea(double side1, double side2) {
        return (side1 * side2);
    }

    static void printSquareArea(double a) {
        System.out.println("Площадь квадрата со стороной " + a + " = " + getSquareArea(a));
    }

    private static double getSquareArea(double side) {
        return side * side;
    }
}
