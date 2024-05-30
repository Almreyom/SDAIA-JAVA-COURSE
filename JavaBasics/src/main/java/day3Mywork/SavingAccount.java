package day3Mywork;

public class SavingAccount extends Account {

    private double limit;

    public SavingAccount(double limit,String name, double balance, double annanualRate) {
        super(name, balance, annanualRate);
        this.limit=limit;
    }

    @Override
    public double withdraw(double amount) {
        if(getBalance()-amount>=limit){
        return super.withdraw(amount);
    }
        return getBalance();
    }
}
