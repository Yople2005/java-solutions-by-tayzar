package chapter4;

public class SumCalculationWithLoop {
	public static void main(String[] args) {
        int sum = 0;
        int x = 1;

        while (x <= 10) {
            sum = sum + x;
            x = x + 1;
        }

        System.out.println("The sum is: " + sum);
    }
}
