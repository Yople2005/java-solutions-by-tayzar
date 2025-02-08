
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(1, 1, 2025);

        date.displayDate();

        date.setMonth(1);
        date.setDay(22);
        date.setYear(2005);

        System.out.println("Modified Date:");
        date.displayDate();
    }
}
