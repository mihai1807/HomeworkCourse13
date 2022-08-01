public class Teacher extends Person{
    public Teacher(String name, String address) {
        super(name, address);
    }
    private int numOfCourses=0;
    private final String [] courses = new String[3];

    public int getNumOfCourses() {
        return numOfCourses;
    }

    void addCourse(String course) throws CantAddElementException {
        if (getNumOfCourses() == 3) throw new CantAddElementException("The teacher already has 3 courses!!!");
        courses[getNumOfCourses()] = course;
        numOfCourses++;
    }

    void printCourses(){
        for (String elem:courses) if (elem!=null) System.out.println(elem);
    }

    @Override
    public String toString() {
        return "The Teacher: "+getName()+" with the address "+getAddress()+" teaches "
                +getNumOfCourses()+" courses.";
    }
}
