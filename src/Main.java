public class Main {
    public static void main(String[] args) {
        Student student = new Student("Steve Rogers","Avengers Tower");
        Student student2 = new Student("Bucky Barnes","Avengers Tower");
        Teacher teacher = new Teacher("Professor X","X Mansion");

        System.out.println("------------------Captain America--------------------");
        try {
            student.addCourse("Shield Physics");
            student.addCourse("Hydra Infiltration");
            student.addCourse("Motivational Speeches");
            student.addCourse("Motivational Speeches2");
            } catch (CantAddElementException e) {
            e.printStackTrace();
            }
        try {
            student.addCourseGrade("Shield Physics", 9.89);
            student.addCourseGrade("Shield Physics", 9.91);
            student.addCourseGrade("Shield Physics", 9.93);
            student.addCourseGrade("Hydra Infiltration", 8.73);
            student.addCourseGrade("Hydra Infiltration", 8.93);
            student.addCourseGrade("Hydra Infiltration", 9.85);
            student.addCourseGrade("Motivational Speeches", 7.85);
            student.addCourseGrade("Motivational Speeches", 8.85);
            student.addCourseGrade("Motivational Speeches", 9.85);
            student.addCourseGrade("Motivational Speeches", 9.85);
            student.addCourseGrade("Motivational Speeches2", 9.85);
        } catch (CantAddElementException e) {
            e.printStackTrace();
        }
        System.out.println(student);
        student.printCourses();
        student.printGrades();
        student.getAverageGradeForCourse("Shield Physics");
        student.getAverageGradeForCourse("Hydra Infiltration");
        student.getAverageGradeForCourse("Motivational Speeches");

        System.out.println("-----------Winter Soldier------------");
        try {
            student2.addCourse("Shield Physics");
            student2.addCourse("Hydra Infiltration");
            student2.addCourse("Motivational Speeches");
        } catch (CantAddElementException e) {
            e.printStackTrace();
        }
        try {
            student2.addCourseGrade("Shield Physics", 9.89);
            student2.addCourseGrade("Shield Physics", 9.91);
            student2.addCourseGrade("Shield Physics", 9.93);
            student2.addCourseGrade("Hydra Infiltration", 8.73);
            student2.addCourseGrade("Hydra Infiltration", 8.93);
            student2.addCourseGrade("Hydra Infiltration", 9.85);
            student2.addCourseGrade("Motivational Speeches", 7.85);
            student2.addCourseGrade("Motivational Speeches", 8.85);
            student2.addCourseGrade("Motivational Speeches", 9.85);
            student2.addCourseGrade("Motivational Speeches", 9.85);
        } catch (CantAddElementException e) {
            e.printStackTrace();
        }
        System.out.println(student);
        student2.printCourses();
        student2.printGrades();
        student2.getAverageGradeForCourse("Shield Physics");
        student2.getAverageGradeForCourse("Hydra Infiltration");
        student2.getAverageGradeForCourse("Motivational Speeches");

        System.out.println("--------------Professor X--------------- ");
        try {
            teacher.addCourse("Telepathy");
            teacher.addCourse("Freezing time 503");
        } catch (CantAddElementException e) {
            e.printStackTrace();
        }
        System.out.println(teacher);
        teacher.printCourses();
        System.out.println("-------------------------------------------------------------------------------------");
        try (Catalogue catalog=new Catalogue()){
            Student[] students = {student,student2};
            catalog.writeGrades(student);
            System.out.println("-------------------------------------------------------------------------------------");
            catalog.writeGrades(students);
            System.out.println("-------------------------------------------------------------------------------------");
            catalog.writeGrades(student, "Shield Physics");
            System.out.println("-------------------------------------------------------------------------------------");
            catalog.writeGrades(student2,"Hydra Infiltration");
            System.out.println("-------------------------------------------------------------------------------------");
            catalog.writeGrades(students,"Shield Physics");
            System.out.println("-------------------------------------------------------------------------------------");
            catalog.writeGrades(students,"Hydra Infiltration");
        } catch (InvalidGradeException e) {
            throw new RuntimeException(e);
        }
    }


}
