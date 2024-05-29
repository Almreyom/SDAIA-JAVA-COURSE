package Mywork;

public class MyMethods {
    public static double caldeg(double mark,int fullMark){
        return mark / fullMark*100; }

    public static String getper(double grade ){
        if(grade > 85) return "Excellent";
        else if ( grade >75 ) return "Very good";
        else if ( grade > 65 ) return "good";
        else if ( grade >= 50 ) return "pass";
                else
                    return "Fail";

    }
}
