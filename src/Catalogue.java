public class Catalogue implements AutoCloseable{
    public Catalogue() {
        System.out.println("The catalogue is open");
    }

    void writeGrades(Student student) throws InvalidGradeException {
        System.out.println(student.getName());
        for (Grade grade: student.grades) {
            if (grade.getGrade() < 1 || grade.getGrade() > 10) {
                throw new InvalidGradeException("The grades have to be between 1 and 10!");
            }
            System.out.println("Course: "+grade.getCourseName()+" and grade: "+grade.getGrade());
        }
    }
    
    void writeGrades(Student student, String courseName) throws InvalidGradeException {
        for(Grade grade: student.grades) {
            if(grade.getGrade() <1 || grade.getGrade()>10) {
                throw new InvalidGradeException("The grades have to be between 1 and 10!");
            }
            if (grade.getCourseName().equals(courseName)) {
                System.out.println("Student: "+student.getName()+" ,course: "+grade.getCourseName()
                +" and grade: "+grade.getGrade());
            }
        }
    }

    void writeGrades(Student [] students) throws InvalidGradeException {
        for (Student student : students) {
            System.out.println(student.getName());
            for (Grade grade : student.grades) {
                if (grade.getGrade() < 1 || grade.getGrade() > 10) {
                    throw new InvalidGradeException("The grades have to be between 1 and 10!");
                }
                System.out.println("Course: " + grade.getCourseName() + " and grade: " + grade.getGrade());
            }
        }
    }

    void writeGrades(Student[] students,String courseName) throws InvalidGradeException {
        for (Student student:students) {
            System.out.println(student.getName());
            for(Grade grade: student.grades) {
                if(grade.getGrade() <1 || grade.getGrade()>10) {
                    throw new InvalidGradeException("The grades have to be between 1 and 10!");
                }
                if (grade.getCourseName().equals(courseName)) {
                    System.out.println("Student: "+student.getName()+" ,course: "+grade.getCourseName()
                            +" and grade: "+grade.getGrade());
                }
            }
        }
    }
    
    @Override
    public void close() {
        System.out.println("The catalogue is closed.");
    }
}
