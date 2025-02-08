
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Toke", "Toke", 3000.00);
        Employee employee2 = new Employee("Toke", "Gyi", 4000.00);

        System.out.printf("Employee 1: %s %s%nYearly Salary: $%.2f%n", 
                employee1.getFirstName(), employee1.getLastName(), employee1.getYearlySalary());
        System.out.printf("Employee 2: %s %s%nYearly Salary: $%.2f%n", 
                employee2.getFirstName(), employee2.getLastName(), employee2.getYearlySalary());

        employee1.giveRaise();
        employee2.giveRaise();

        System.out.printf("%nAfter 10%% raise:%n");
        System.out.printf("Employee 1: %s %s%nYearly Salary: $%.2f%n", 
                employee1.getFirstName(), employee1.getLastName(), employee1.getYearlySalary());
        System.out.printf("Employee 2: %s %s%nYearly Salary: $%.2f%n", 
                employee2.getFirstName(), employee2.getLastName(), employee2.getYearlySalary());
    }
}
