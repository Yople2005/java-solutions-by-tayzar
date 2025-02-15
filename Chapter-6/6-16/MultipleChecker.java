import java.util.Scanner;

public class MultipleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the first integer (or type 'exit' to quit): ");
            if (scanner.hasNextInt()) {
                int first = scanner.nextInt();
                System.out.print("Enter the second integer: ");
                int second = scanner.nextInt();

                if (isMultiple(first, second)) {
                    System.out.println(second + " is a multiple of " + first);
                } else {
                    System.out.println(second + " is not a multiple of " + first);
                }
            } else if (scanner.hasNext("exit")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer or 'exit' to quit.");
                scanner.next(); // Consume the invalid input
            }
        }

        scanner.close();
    }

    public static boolean isMultiple(int first, int second) {
        return second % first == 0;
    }
}
