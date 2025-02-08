public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.0; // initial amount before interest
        int years = 10; // number of years

        System.out.printf("%-10s%-10s%-10s%n", "Year", "Rate", "Amount on deposit");

        for (int rate = 5; rate <= 10; rate++) {
            double amount;
            double annualRate = rate / 100.0;

            System.out.printf("%nInterest Rate: %d%%%n", rate);
            for (int year = 1; year <= years; year++) {
                amount = principal * Math.pow(1.0 + annualRate, year);
                System.out.printf("%4d%14.2f%n", year, amount);
            }
        }
    }
}
