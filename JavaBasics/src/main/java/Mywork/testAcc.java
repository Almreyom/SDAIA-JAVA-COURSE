package Mywork;

public class testAcc {
    public static void main(String []args){
        Account c1 = new Account("Reyom",500,0.05);
        Account c2 = new Account("Dhay",50,0.04);

        System.out.println(c1.getBalance());
        System.out.println(c2.getBalance());
    }
}
