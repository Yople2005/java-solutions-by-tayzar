package chapter5;

public class CombinedTrianglePatterns {
    public static void main(String[] args) {
        int size = 10;

        for (int i = 1; i <= size; i++) {
            // Pattern (a)
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            for (int j = i; j < size; j++) {
                System.out.print(' ');
            }

            System.out.print("   "); // Space between patterns

            // Pattern (b)
            for (int j = size; j >= i; j--) {
                System.out.print('*');
            }
            for (int j = size; j > size - i + 1; j--) {
                System.out.print(' ');
            }

            System.out.print("   "); // Space between patterns

            // Pattern (c)
            for (int j = 1; j < i; j++) {
                System.out.print(' ');
            }
            for (int j = i; j <= size; j++) {
                System.out.print('*');
            }

            System.out.print("   "); // Space between patterns

            // Pattern (d)
            for (int j = size; j > i; j--) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }

            System.out.println(); // Move to the next line
        }
    }
}

