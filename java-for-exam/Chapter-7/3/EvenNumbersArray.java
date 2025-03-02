public class EvenNumbersArray {
    public static void main(String[] args) {
        int[] evenNumbers = new int[10];

        // Populate the array with the first 10 even numbers
        for (int i = 0; i < evenNumbers.length; i++) {
            evenNumbers[i] = 2 * (i + 1);
        }

        // Print the even numbers
        for (int number : evenNumbers) {
            System.out.print(number + " ");
        }
    }
}
