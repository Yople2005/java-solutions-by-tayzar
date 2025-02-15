import java.util.Scanner;

public class QualityPointsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's average: ");
        int average = scanner.nextInt();

        int qualityPoints = qualityPoints(average);
        System.out.println("The quality points for an average of " + average + " is: " + qualityPoints);

        scanner.close();
    }

    public static int qualityPoints(int average) {
        if (average >= 90 && average <= 100) {
            return 4;
        } else if (average >= 80 && average <= 89) {
            return 3;
        } else if (average >= 70 && average <= 79) {
            return 2;
        } else if (average >= 60 && average <= 69) {
            return 1;
        } else {
            return 0;
        }
    }
}
