import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5};
        int element = 3;
        int position = 2;
        int[] newArray = new int[numbers.length + 1];

        // Insert the element at the specified position
        for (int i = 0, j = 0; i < numbers.length; i++, j++) {
            if (j == position) {
                newArray[j] = element;
                j++;
            }
            newArray[j] = numbers[i];
        }

        System.out.println("Array before insertion: " + Arrays.toString(numbers));
        System.out.println("Array after insertion: " + Arrays.toString(newArray));
    }
}
