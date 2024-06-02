package s4;



import java.sql.*;
import java.util.ArrayList;

public class JobsDAO {

    private static final String URL =  "jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\untitled2\\src\\main\\java\\org\\example\\hr.db";
    private static final String SELECT_ALL_JOBS = "select * from JOB";
    private static final String SELECT_ONE_JOB = "select * from JOBS where job_id = ?";
    private static final String INSERT_JOB = "insert into jobs values (?, ?, ?)";
    private static final String UPDATE_JOB = "update jobs set job_name = ?, job_id = ? where job_id = ?";
    private static final String DELETE_JOB = "delete from jobs where jobd_id = ?";

    public void setInsertJob(jobs j) throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(INSERT_JOB);
        st.setInt(1, j.getJob_Id());
        st.setString(2, j.getJob_title());
        st.setDouble(3, j.getMin_salary());
        st.setDouble(4, j.getMax_salary());
        st.executeUpdate();
    }

    public void setUpdateJob(jobs j) throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(UPDATE_JOB);
        st.setInt(1, j.getJob_Id());
        st.setString(2, j.getJob_title());
        st.setDouble(3, j.getMin_salary());
        st.setDouble(4, j.getMax_salary());
        st.executeUpdate();
    }

    public void UpdateJob(int jobId) throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(DELETE_JOB);
        st.setInt(1, jobId);
        st.executeUpdate();
    }

    public Department selectJob(int JobId) throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(SELECT_ONE_JOB);
        st.setInt(1, JobId);
        ResultSet rs = st.executeQuery();
        if(rs.next()) {
            return new Department(rs);
        }
        else {
            return null;
        }
    }

    public ArrayList<jobs> selectAlljobs() throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(SELECT_ALL_JOBS);
        ResultSet rs = st.executeQuery();
        ArrayList<jobs> depts = new ArrayList<>();
        while (rs.next()) {
            depts.add(new jobs(rs));
        }

        return depts;
    }

}