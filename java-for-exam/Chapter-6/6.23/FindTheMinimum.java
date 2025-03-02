import java.util.Scanner;

public class FindTheMinimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first floating-point number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second floating-point number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter the third floating-point number: ");
        double num3 = scanner.nextDouble();
        
        double min = minimum3(num1, num2, num3);
        System.out.printf("The smallest value is: %.2f%n", min);
        
        scanner.close();
    }

    public static double minimum3(double a, double b, double c) {
        return Math.min(Math.min(a, b), c);
    }
}
