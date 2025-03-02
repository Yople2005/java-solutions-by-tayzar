package Exam;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Bryen", "Taster", 2134, "HD Manager");
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " (" + employee1.getEmployeeId() + ")");

        Employee employee2 = new Employee("Allison", "Taster", 7865, "Programmer");
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + " (" + employee2.getEmployeeId() + ")");
    }
}
