import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter '1' to convert Fahrenheit to Celsius.");
        System.out.println("Enter '2' to convert Celsius to Fahrenheit.");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter the Fahrenheit temperature: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = celsius(fahrenheit);
            System.out.printf("The Celsius equivalent of %.2f°F is %.2f°C%n", fahrenheit, celsius);
        } else if (choice == 2) {
            System.out.print("Enter the Celsius temperature: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = fahrenheit(celsius);
            System.out.printf("The Fahrenheit equivalent of %.2f°C is %.2f°F%n", celsius, fahrenheit);
        } else {
            System.out.println("Invalid choice. Please enter '1' or '2'.");
        }

        scanner.close();
    }

    public static double celsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    public static double fahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }
}
