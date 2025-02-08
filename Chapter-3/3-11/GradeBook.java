
public class GradeBook {
    private String courseName;  
    private String instructorName;  

    public GradeBook(String courseName, String instructorName) {
        this.courseName = courseName;
        this.instructorName = instructorName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void displayMessage() {
        System.out.printf("Welcome to the grade book for\n%s!\n", getCourseName());
        System.out.printf("This course is presented by: %s\n", getInstructorName());
    }
}
