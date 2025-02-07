package chapter5;

import java.util.Scanner;

public class DeMorganLaws {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get values for x and y
        System.out.print("Enter value for x: ");
        int x = scanner.nextInt();
        System.out.print("Enter value for y: ");
        int y = scanner.nextInt();

        // Check expression (a)
        boolean originalA = !(x < 5) && !(y >= 7);
        boolean equivalentA = (x >= 5) || (y < 7);
        System.out.println("Expression (a) - Original: " + originalA + ", Equivalent: " + equivalentA + "\n");

        // Get values for a, b, and g
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();
        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();
        System.out.print("Enter value for g: ");
        int g = scanner.nextInt();

        // Check expression (b)
        boolean originalB = !(a == b) || !(g != 5);
        boolean equivalentB = (a != b) || (g == 5);
        System.out.println("Expression (b) - Original: " + originalB + ", Equivalent: " + equivalentB + "\n");

        // Get values for x and y
        System.out.print("Enter value for x: ");
        x = scanner.nextInt();
        System.out.print("Enter value for y: ");
        y = scanner.nextInt();

        // Check expression (c)
        boolean originalC = !(x <= 8 && y > 4);
        boolean equivalentC = (x > 8) || (y <= 4);
        System.out.println("Expression (c) - Original: " + originalC + ", Equivalent: " + equivalentC + "\n");

        // Get values for i and j
        System.out.print("Enter value for i: ");
        int i = scanner.nextInt();
        System.out.print("Enter value for j: ");
        int j = scanner.nextInt();

        // Check expression (d)
        boolean originalD = !(i > 4 || j <= 6);
        boolean equivalentD = (i <= 4) && (j > 6);
        System.out.println("Expression (d) - Original: " + originalD + ", Equivalent: " + equivalentD);
    }
}

