package chapter5;

import java.util.Scanner;

public class SmallestValueFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values to input: ");
        int numberOfValues = scanner.nextInt();

        if (numberOfValues <= 0) {
            System.out.println("Please enter a positive number of values.");
            return;
        }

        System.out.print("Enter value 1: ");
        int smallest = scanner.nextInt();

        for (int i = 2; i <= numberOfValues; i++) {
            System.out.print("Enter value " + i + ": ");
            int currentValue = scanner.nextInt();

            if (currentValue < smallest) {
                smallest = currentValue;
            }
        }

        System.out.println("The smallest value is: " + smallest);
    }
}
