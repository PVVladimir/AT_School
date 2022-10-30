/*

 * Homework for lesson 1
 */
public class Homework001 {

    private static double squareArea(double side){
        return Math.pow(side, 2);
    }

    private static double circleArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    private static double triangleArea(double sideA, double sideB, double sideC){
        double semiPerimeter = (sideA + sideB + sideC) / 2.0;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB)
                * (semiPerimeter - sideC));
    }

    public static void main(String[] args) {
        System.out.println("Hello World, я ${username}");
        double squareSide = 2.7;
        System.out.println("Площадь квадрата с стороной " + squareSide + " равна "
                + squareArea(squareSide));
        double circleRadius = 7.3;
        System.out.println("Площадь круга с радиусом " + circleRadius + " равна "
                + circleArea(circleRadius));
        double triangleSideA = 3.3;
        double triangleSideB = 4.4;
        double triangleSideC = 5.5;
        System.out.println("Площадь треугольника с сторонами "
                + triangleSideA + ", " + triangleSideB + ", " + triangleSideC + ", "
                + " равна " + triangleArea(triangleSideA, triangleSideB, triangleSideC));
    }
}
