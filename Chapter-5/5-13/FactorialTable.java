
public class FactorialTable {
    public static void main(String[] args) {
        System.out.printf("%-10s%-20s%n", "Number", "Factorial");
        System.out.println("------------------------------");
        
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%-10d%-20d%n", i, calculateFactorial(i));
        }
    }

    public static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

