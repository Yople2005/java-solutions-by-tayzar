public class MinElement {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 1, 7};
        int min = numbers[0];

        // Find the minimum element
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }

        System.out.println("Minimum element: " + min);
    }
}
