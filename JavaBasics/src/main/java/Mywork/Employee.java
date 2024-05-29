package Mywork;

public class Employee{
   String name;
   int salary;
   int hireYear;
   public Employee( String n ,int s ,int hy){
    name = n ;
    salary = s ;
    hireYear = hy;
   }
   public double calcsalary(){
       return salary * 12;
   }
   public int period(){
       return 2024 - hireYear ;
   }
}
