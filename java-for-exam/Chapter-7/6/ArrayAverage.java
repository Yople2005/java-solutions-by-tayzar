public class ArrayAverage {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int sum = 0;

        // Calculate the sum of all elements
        for (int number : numbers) {
            sum += number;
        }

        // Calculate the average
        double average = (double) sum / numbers.length;
        System.out.println("Average of elements: " + average);
    }
}
