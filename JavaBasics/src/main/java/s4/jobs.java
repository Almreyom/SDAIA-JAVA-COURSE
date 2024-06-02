package s4;

import java.sql.ResultSet;
import java.sql.SQLException;

public class jobs {

    private int job_Id;
    private String job_title;
    private double min_salary;
    private double max_salary;

    public jobs(int job_Id, String job_title, double min_salary, double max_salary) {
        this.job_Id = job_Id;
        this.job_title = job_title;
        this.min_salary = min_salary;
        this.max_salary = max_salary;
    }

    public jobs(ResultSet rs) throws SQLException {
        job_Id = rs.getInt("job_Id");
        job_title = rs.getString("job_title");
        min_salary = rs.getDouble("min_salary");
        max_salary = rs.getDouble("max_salary");

    }

    public int getJob_Id() {
        return job_Id;
    }

    public void setJob_Id(int job_Id) {
        this.job_Id = job_Id;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public double getMin_salary() {
        return min_salary;
    }

    public void setMin_salary(double min_salary) {
        this.min_salary = min_salary;
    }

    public double getMax_salary() {
        return max_salary;
    }

    public void setMax_salary(double max_salary) {
        this.max_salary = max_salary;
    }

    @Override
    public String toString() {
        return "jobs{" +
                "job_Id=" + job_Id +
                ", job_title='" + job_title + '\'' +
                ", min_salary=" + min_salary +
                ", max_salary=" + max_salary +
                '}';
    }
}