
import java.util.Scanner;

public class Multiples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter two space-separated integers (-1 to exit): ");
            int first = scanner.nextInt();
            if (first == -1) {
                break; // Exit condition }
                int second = scanner.nextInt();
                if (isMultiple(first, second)) {
                    System.out.printf("%d is a multiple of %d%n", second, first);
                } else {
                    System.out.printf("%d is not a multiple of %d%n", second, first);
                }
            }
            scanner.close();
        } 

    public static boolean isMultiple(int a, int b) {
        return b % a == 0;
    }
}
