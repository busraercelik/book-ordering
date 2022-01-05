package java101.variables;

import java.util.Scanner;

public class Triangle {
    /**
     *  calculate hypotenuse in right triangle
     * @param args
     */
    public static void main(String[] args) {
        int side1, side2;
        double hypotenuse;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value for one side: ");
        side1 = scan.nextInt();
        System.out.println("Enter a value for another side: ");
        side2 = scan.nextInt();

        hypotenuse = Math.sqrt((double) (side1 * side1) + (side2 * side2));
        System.out.printf("Hypotenuse : %.2f", hypotenuse);

        double perimeterOfTriangle = side1 + side2 + hypotenuse;
        System.out.printf("\nPerimeter of Triangle: %.2f \n", perimeterOfTriangle);

        double areaOfTriangle = perimeterOfTriangle *
                (perimeterOfTriangle - side1) *
                (perimeterOfTriangle - side2) *
                (perimeterOfTriangle - hypotenuse);
        System.out.printf("Area of Triangle: %.2f ", areaOfTriangle);

    }
}
