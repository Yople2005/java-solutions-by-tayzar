package chapter4;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = input.nextInt();

        System.out.print("Enter balance at the beginning of the month: ");
        int beginningBalance = input.nextInt();

        System.out.print("Enter total of all items charged this month: ");
        int charges = input.nextInt();

        System.out.print("Enter total of all credits this month: ");
        int credits = input.nextInt();

        System.out.print("Enter allowed credit limit: ");
        int creditLimit = input.nextInt();

        int newBalance = beginningBalance + charges - credits;

        System.out.printf("New balance: %d\n", newBalance);

        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded");
        }
    }
}

