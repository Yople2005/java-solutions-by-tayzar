import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer to check if it's even or odd: ");
        int number = scanner.nextInt();
        
        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        
        scanner.close();
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
