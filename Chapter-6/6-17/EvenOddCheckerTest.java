import java.util.Scanner;

public class EvenOddCheckerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer (or type 'exit' to quit): ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (EvenOddChecker.isEven(number)) {
                    System.out.println(number + " is even.");
                } else {
                    System.out.println(number + " is odd.");
                }
            } else if (scanner.hasNext("exit")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer or 'exit' to quit.");
                scanner.next(); 
            }
        }

        scanner.close();
    }
}
