package chapter4;

import java.util.Scanner;

public class TriangleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first side: ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter the second side: ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Enter the third side: ");
        double side3 = scanner.nextDouble();
        
        if (side1 > 0 && side2 > 0 && side3 > 0) {
            if (isTriangle(side1, side2, side3)) {
                System.out.println("The values represent the sides of a triangle.");
            } else {
                System.out.println("The values do not represent the sides of a triangle.");
            }
        } else {
            System.out.println("All sides must be greater than zero.");
        }
    }

    public static boolean isTriangle(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }
}

