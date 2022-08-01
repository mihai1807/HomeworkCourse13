public class Grade {
    private String courseName;
    private double grade;

    public Grade(String courseName, double grade) {
        this.courseName = courseName;
        this.grade = grade;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "courseName='" + courseName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
