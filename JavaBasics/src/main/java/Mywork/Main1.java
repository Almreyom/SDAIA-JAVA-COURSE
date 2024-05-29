package Mywork;

public class Main1 {
    public static void main(String[] args) {
            StudentManager manager = new StudentManager();

            Student1 student1 = new Student1("John Doe", 1);
            Student1 student2 = new Student1("Jane Smith", 2);
            Student1 student3 = new Student1("Alice Johnson", 3);

            manager.addStudent(student1);
            manager.addStudent(student2);
            manager.addStudent(student3);

            System.out.println("student n.2");
            Student retrievedStudent = manager.getStudentById(2);
            if (retrievedStudent != null) {
                System.out.println("Name: " + retrievedStudent1.getName() + ", ID: " + retrievedStudent1.getId());
            } else {
                System.out.println("no student could be found");
            }


            System.out.println("all the student in the list");
            for (Student student : manager.getAllStudents()) {
                System.out.println("Name: " + student1.getName() + ", ID: " + student1.getId());
            }


            System.out.println("remove student no.2 and bring the list back");
            boolean isRemoved = manager.removeStudentById(2);
            if (isRemoved) {
                System.out.println("the student is gone");
            } else {
                System.out.println("could not find any student");
            }


            System.out.println("show mee all the student in the list");
            for (Student student : manager.getAllStudents()) {
                System.out.println("Name: " + student1.getName() + ", ID: " + student1/.getId());
            }
        }
    }
