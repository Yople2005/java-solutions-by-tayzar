
public class GradeBookTest {
    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook("Introduction to Java Programming", "Dr. Toke Gyi");

        gradeBook.displayMessage();

        gradeBook.setCourseName("Advanced Java Programming");
        gradeBook.setInstructorName("Prof. Toke Toke");

        System.out.println("\nModified GradeBook Information:");
        gradeBook.displayMessage();
    }
}
