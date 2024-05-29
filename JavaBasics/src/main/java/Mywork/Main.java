package Mywork;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" the pers is ");
        int m = sc.nextInt();
        int fl = sc.nextInt();

        double caldeg = MyMethods.caldeg(m,fl);
        String getper= MyMethods.getper(caldeg);
        System.out.print("your grade is "+ getper);
    }
}
