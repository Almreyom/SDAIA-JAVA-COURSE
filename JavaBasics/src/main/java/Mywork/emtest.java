package Mywork;

public class emtest {
    public static void main(String[] args) {

        Employee x = new Employee("Reyom", 50000, 2023);

        System.out.println(x.name);
        System.out.println(x.calcsalary());
        System.out.println(x.period());
    }
}