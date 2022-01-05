package java101.variables;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        int radius;
        float pi = 3.14F;
        double perimeterOfCircle;
        double areaOfCircle;
        double areaOfCircleSegment;
        float centerAngle;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        radius = scanner.nextInt();
        System.out.println("Enter the center angle of circle you want to calculate: ");
        centerAngle = scanner.nextFloat();

        perimeterOfCircle = 2 * pi * radius;
        areaOfCircle = pi * Math.pow(radius,2);
        areaOfCircleSegment = (areaOfCircle * centerAngle) / 360;

        System.out.println("Perimeter of Circle is " + Math.round(perimeterOfCircle));
        System.out.println("Area of Circle is " + Math.round(areaOfCircle));
        System.out.println("Area of Circle Segment is " + Math.round(areaOfCircleSegment));
    }
}
