package chapter4;

import java.util.Scanner;

public class FindTwoLargestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter integer " + i + ": ");
            int number = scanner.nextInt();

            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }
        }

        System.out.println("The largest number is: " + largest);
        System.out.println("The second largest number is: " + secondLargest);
        scanner.close();
    }
}
