package OOPBASICHW;

public class Student extends person implements comparableById{
    private int studentID;
    private String course;

    public Student(String name, int age, String address, int studentID, String course) {
        super();
    super.setName(name);
            super.setAge(age);
           super.setAddress (address);
        this.studentID = studentID;
        this.course = course;
    }
    public Student(){

    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        if(studentID<=0){
            throw new IllegalArgumentException("studentID must be a postive ineteger");
        }
        this.studentID = studentID;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String getDetails() {
        return "Student{" +
                " Name= " + getName() +
                " age= " + getAge() +
                " address= " + getAddress() +
                ", studentID= " + studentID +
                " course= " + course +
                '}';
    }

    @Override
    public boolean comparableById(int id) {
        return this.studentID==id;
    }
}


