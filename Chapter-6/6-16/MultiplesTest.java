import java.util.Scanner;

public class MultiplesTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter first integer (or 0 to quit): ");
            int first = input.nextInt();
            if (first == 0) break;

            System.out.print("Enter second integer: ");
            int second = input.nextInt();

            if (IsMultiple.isMultiple(first, second)) {
                System.out.printf("%d is a multiple of %d\n", second, first);
            } else {
                System.out.printf("%d is not a multiple of %d\n", second, first);
            }
        }

        input.close();
    }
}
