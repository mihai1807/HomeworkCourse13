public class Student extends Person {

    private int numOfCourses=0, numOfGrades=0;
    public final String [] courses = new String[3];
    Grade [] grades = new Grade[10];

    public Student(String name, String address) {
        super(name, address);
    }

    public Grade[] getGrades() {
        return grades;
    }

    public void setGrades(Grade[] grades) {
        this.grades = grades;
    }

    public int getNumOfCourses() {
        return numOfCourses;
    }


    public int getNumOfGrades() {
        return numOfGrades;
    }


    void addCourse(String course) throws CantAddElementException {
        if (getNumOfCourses() == 3) throw new CantAddElementException("The student already has 3 courses!!!");
        courses[getNumOfCourses()] = course;
        numOfCourses++;
    }

    void addCourseGrade(String course, double grade) throws CantAddElementException {
        if (getNumOfGrades() == 10) throw new CantAddElementException("The student already has 10 grades");
        grades[getNumOfGrades()] = new Grade(course,grade);
        numOfGrades++;
    }

    void printGrades(){
        System.out.println("--------------Grades------------");
        for (Grade elem:grades) if (elem!=null) System.out.println(elem);
    }

    void printCourses(){
        System.out.println("---Courses---");
        for (String elem:courses) if (elem!=null) System.out.println(elem);
    }


    void getAverageGradeForCourse(String course) {
        double sum = 0;
        int foundGrades = 0;
        for (Grade elem:grades) {
            if (elem.getCourseName().equals(course)){
                sum+=elem.getGrade();
                foundGrades++;
            }
        }
        System.out.println(getName()+"'s average grade for "+course+" is "+ sum/foundGrades);
    }

    @Override
    public String toString() {
        return "The Student "+getName()+" with the address "+getAddress()+" is enlisted in "
                +getNumOfCourses()+" courses and has "+getNumOfGrades()+" grades.";

    }
}

