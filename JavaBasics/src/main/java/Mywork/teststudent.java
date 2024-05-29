package Mywork;

public class teststudent {
    public static void main(String []args){

        var s1 = new Student("Reyom",23);
        var s2 = new Student("Dhay",15);

        Student.fullmark=25;
            s1.setMark(-21);
            s1.getMark();
        System.out.println(s1.name);
        System.out.println(s1.getprecent());
        System.out.println(s1.getgrade());
        System.out.println("=================================");
        System.out.println(s2.name);
        System.out.println(s2.getprecent());
        System.out.println(s2.getgrade());
    }
}
