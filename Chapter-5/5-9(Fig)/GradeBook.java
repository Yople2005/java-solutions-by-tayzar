import java.util.Scanner;

public class GradeBook {
    private String courseName;
    private int total;
    private int gradeCounter;
    private int aCount;
    private int bCount;
    private int cCount;
    private int dCount;
    private int fCount;

    public GradeBook(String name) {
        courseName = name;
        total = 0;
        gradeCounter = 0;
        aCount = 0;
        bCount = 0;
        cCount = 0;
        dCount = 0;
        fCount = 0;
    }

    public void setCourseName(String name) {
        courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayMessage() {
        System.out.printf("Welcome to the grade book for \n%s!\n\n", getCourseName());
    }

    public void inputGrades() {
        Scanner input = new Scanner(System.in);

        int grade;

        System.out.printf("%s\n%s\n  %s\n   %s\n ", "Enter the integer grades in the range 0-100.",
                "Type the end-of-file indicator to terminate input", "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
                "On Windows type <Ctrl> z then press Enter");

        while (input.hasNext()) {
            if (input.hasNextInt()) {
                grade = input.nextInt();
                if (grade >= 0 && grade <= 100) {
                    total += grade;
                    ++gradeCounter;
                    incrementLetterGradeCounter(grade);
                } else {
                    System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer grade.");
                input.next(); // discard the invalid input
            }
        }

        input.close(); // Close the scanner to prevent resource leak
    }

    private void incrementLetterGradeCounter(int grade) {
        switch (grade / 10) {
            case 10:
            case 9:
                ++aCount;
                break;

            case 8:
                ++bCount;
                break;

            case 7:
                ++cCount;
                break;

            case 6:
                ++dCount;
                break;

            default:
                if (grade >= 0) {
                    ++fCount;
                }
                break;
        }
    }

    public void displayGradeReport() {
        System.out.println("\nGrade Report:");

        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter;

            System.out.printf("Total of the %d grades entered is %d\n", gradeCounter, total);
            System.out.printf("Class average is %.2f\n", average);
            System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
                    "Number of students who received each grade:",
                    "A:", aCount,
                    "B:", bCount,
                    "C:", cCount,
                    "D:", dCount,
                    "F:", fCount);
        } else {
            System.out.println("No grades were entered");
        }
    }
}