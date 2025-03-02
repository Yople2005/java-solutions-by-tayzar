public class MaxElement {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 7};
        int max = numbers[0];

        // Loop through each number in the array to find the maximum value
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Maximum element: " + max);
    }
}
