package chapter4;

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int largest = Integer.MIN_VALUE;

        while (counter < 10) {
            System.out.print("Enter integer " + (counter + 1) + ": ");
            int number = scanner.nextInt();

            if (number > largest) {
                largest = number;
            }

            counter++;
        }

        System.out.println("The largest number is: " + largest);
        scanner.close();
    }
}
