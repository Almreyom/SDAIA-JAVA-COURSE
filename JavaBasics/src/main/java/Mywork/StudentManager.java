package Mywork;
import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students1;


    public StudentManager() {
        students1 = new ArrayList<>();
    }


    public void addStudent(Student student) {
        students1.add(student);
    }


    public Student getStudentById(int id) {
        for (Student student : students1) {
            if (students1.getId() == id) {
                return student;
            }
        }
        return null;
    }


    public ArrayList<Student> getAllStudents() {
        return new ArrayList<>(students1);
    }

    public boolean removeStudentById(int id) {
        for (Student student : students1) {
            if (students1.getId() == id) {
                students1.remove(student);
                return true;
            }
        }
        return false;
    }
}
