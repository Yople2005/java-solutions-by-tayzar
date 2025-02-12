package chapter4;

public class TabularOutput {
    public static void main(String[] args) {
        System.out.println("N\t10*N\t100*N\t1000*N");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "\t" + (10 * i) + "\t" + (100 * i) + "\t" + (1000 * i));
        }
    }
}
