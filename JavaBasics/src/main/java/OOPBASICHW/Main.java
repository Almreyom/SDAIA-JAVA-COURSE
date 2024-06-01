package OOPBASICHW;
import java.util.IllegalFormatException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        person p1 = new person("Reyom", 24, "alhammra");
        person p2 = new person ();


        p2.setName("Mashael");
        p2.setAge(25);
        p2.setAddress("alhammra");

        System.out.println("p1 name is : "+p1.getName());
        System.out.println("p1 age is :"+p1.getAge());
        System.out.println("p1 address is:"+p1.getAddress());

        System.out.println("p2 name is : "+p2.getName());
        System.out.println("p2 age is :"+p2.getAge());
        System.out.println("p2 address is:"+p2.getAddress());

        System.out.println("----------------------------------------------");


        Student s1 = new Student("Nawaf",23,"Alkhaleej",4400,"Ophthalmology");
        System.out.println(s1.getDetails());
        System.out.println("does s1 have an ID 4400?"+ s1.comparableById(s1.getStudentID()));

        System.out.println("----------------------------------------------");

        school school = new school();

        Student student1 = new Student("Reyom", 20, "Riyadh", 1000, "Computer Science");
        Student student2 = new Student("Sara", 22, "Riyadh", 1001, "Baiology");
        Student student3 = new Student("Bushra", 21, "Riyadh", 1002, "Mathematics");


        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        System.out.println("Students:");
        school.displayAllStudents();

        school.removeStudentById(4401);

        school.displayAllStudents();

        school.sortStudentsByName();
        System.out.println("Students sorted by name:");
        school.displayAllStudents();


        int searchId = 4400 ;
        Student foundstudent = school.findstudentById(searchId);
        if(foundstudent != null){
            System.out.println("student could be found by ID "+ searchId);
            System.out.println(foundstudent.getDetails());}
        else {
            System.out.println("student with this id could not be found"+searchId);
        }
        school sch = new school();


       school.readStudentsFromFile("C:\\Users\\dev\\Desktop\\Students");


        school.displayAllStudents();

    }


}