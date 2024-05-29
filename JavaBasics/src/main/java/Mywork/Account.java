package Mywork;

public class Account {

    String name;
   private double balance ;
    double annanualRate;

    public Account(String name , double balance , double annanualRate){
        this.name=name;
        this.balance=balance;
        this.annanualRate=annanualRate;

    }
    public double getMonthlyRate(){
        return annanualRate/12;
    }
    public double getmonthltyInt(){
        return balance * getMonthlyRate();
    }
    public double deposite(double amount){
       balance += amount;
        return balance;

    }
    public double withdraw(double amount){
        balance -= amount;
        return balance;

    }
    public double getBalance(){
        return balance;
}}
