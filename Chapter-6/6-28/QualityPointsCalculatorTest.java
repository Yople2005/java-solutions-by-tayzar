import java.util.Scanner;

public class QualityPointsCalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's average: ");
        int average = scanner.nextInt();

        int qualityPoints = QualityPointsCalculator.qualityPoints(average);
        System.out.println("The quality points for an average of " + average + " is: " + qualityPoints);

        scanner.close();
    }
}
