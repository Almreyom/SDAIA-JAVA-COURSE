package day3Mywork;

public class CheckingAccount extends Account{
    public CheckingAccount(String name, double balance, double annanualRate) {
        super(name, balance, annanualRate);
    }

    @Override
    public double withdraw(double amount) {
        if(getmonthltyInt()-amount>=0){
        return super.withdraw(amount);
    }
        return getBalance();
    }
}
