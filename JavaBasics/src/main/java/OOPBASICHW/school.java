package OOPBASICHW;

import java.io.*;
import java.util.*;

public class school {
    private List<Student> students;

    public school() {
        students = new ArrayList<>();
    }

//    public school() {
//
//    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudentById(int studentId) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getStudentID() == studentId) {
                iterator.remove();
                System.out.println("Student with ID" + studentId + "removed successfully.");
                return;
            }
        }
    }

        public void displayAllStudents() {
            System.out.println(" list of thhe sudents");
            for (Student student : students) {
                System.out.println(student.getDetails());
                System.out.println();
            }
        }

    public void sortStudentsByName() {
        Collections.sort(students, Comparator.comparing(Student::getName));
    }

    public Student findstudentById(int studentId) {
        sortStudentsByName();
        int low = 0;
        int high = students.size();

        while (low <= high) {
            int mid = (low + high) / 2;
            Student midStudent;
            midStudent = students.get(mid);
            if (midStudent.getStudentID() == studentId) {
                return midStudent;
            } else if (midStudent.getStudentID() < studentId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return null;
    }

    public void readStudentsFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                String name = parts[0].split(": ")[1];
                int age = Integer.parseInt(parts[1].split(": ")[1]);
                String address = parts[2].split(": ")[1];
                int studentId = Integer.parseInt(parts[3].split(": ")[1]);
                String course = parts[4].split(": ")[1];
                addStudent(new Student(name, age, address, studentId, course));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}









