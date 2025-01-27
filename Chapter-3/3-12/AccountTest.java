package chapter2;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account(50.00);
        Account account2 = new Account(-7.53);

        System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
        System.out.printf("account2 balance: $%.2f\n\n", account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        account1.credit(depositAmount);
        System.out.printf("\nadding %.2f to account1 balance\n\n", depositAmount);

        System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
        System.out.printf("account2 balance: $%.2f\n\n", account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        account2.credit(depositAmount);
        System.out.printf("\nadding %.2f to account2 balance\n\n", depositAmount);

        System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
        System.out.printf("account2 balance: $%.2f\n\n", account2.getBalance());

        System.out.print("Enter debit amount for account1: ");
        double debitAmount = input.nextDouble();
        account1.debit(debitAmount);
        System.out.printf("\nsubtracting %.2f from account1 balance\n\n", debitAmount);

        System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
        System.out.printf("account2 balance: $%.2f\n", account2.getBalance());
    }
}
