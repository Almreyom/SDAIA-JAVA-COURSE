package Mywork;

public class Student {
    String name ;

    double mark;

    static int fullmark;

    public Student(String name , double mark){
        this.name=name;
        this.mark=mark;
    }
    public double getprecent(){
        return mark / fullmark *100;
    }
    public String getgrade(){
        if(mark > 85) return "Excellent";
        else if ( mark >75 ) return "Very good";
        else if ( mark > 65 ) return "good";
        else if ( mark >= 50 ) return "pass";
        else
            return "Fail";

    }

    public double getMark(){
        return mark;
    }
    public void setMark(double value){
        if(value >= 0 ){
            this.mark=value;
        }
    }
}

