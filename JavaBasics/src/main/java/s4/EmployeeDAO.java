package s4;

import java.sql.*;
import java.util.ArrayList;

public class EmployeeDAO {

    private static final String URL =  "jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\untitled2\\src\\main\\java\\org\\example\\hr.db";
    private static final String SELECT_ALL_Employee = "select * from Employee";
    private static final String SELECT_ONE_Employee = "select * from Employee where Employee_id = ?";
    private static final String INSERT_Employee = "insert into Employee values (?, ?, ?,?, ?, ?,?, ?, ?,?)";
    private static final String UPDATE_Employee = "update jobs set Employeeid = ?, salary = ? where first_name = ?";
    private static final String DELETE_Employee = "delete from jobs where Employeeid = ?";

    public void setInsertEmployee(Employee e) throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(INSERT_Employee);
        st.setInt(1, e.getEmployeeID());
        st.setString(2, e.getFisrt_name());
        st.setString(3, e.getLast_name());
        st.setString(4, e.getEmail());
        st.setDouble(5, e.getPhone());
        st.setInt(1, e.getHire_date());
        st.setInt(1, e.getJob_id());
        st.setInt(1, e.getSalary());
        st.setInt(1, e.getManage());
        st.setInt(1, e.getDepartment_id());
        st.executeUpdate();
    }

    public void setUpdateEmployee(Employee e) throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(UPDATE_Employee);
        st.setInt(1, e.getEmployeeID());
        st.setString(2, e.getFisrt_name());
        st.setString(3, e.getLast_name());
        st.setString(4, e.getEmail());
        st.setDouble(5, e.getPhone());
        st.setInt(1, e.getHire_date());
        st.setInt(1, e.getJob_id());
        st.setInt(1, e.getSalary());
        st.setInt(1, e.getManage());
        st.setInt(1, e.getDepartment_id());
        st.executeUpdate();
    }

    public Employee selectEmployee(int EmployeeID) throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(SELECT_ONE_Employee);
        st.setInt(1, EmployeeID);
        ResultSet rs = st.executeQuery();
        if(rs.next()) {
            return new Employee(rs);
        }
        else {
            return null;
        }
    }
    public ArrayList<Employee> selectAllEmployee() throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(SELECT_ALL_Employee);
        ResultSet rs = st.executeQuery();
        ArrayList<Employee> emp = new ArrayList<>();
        while (rs.next()) {
            emp.add(new Employee (rs));
        }


        return emp;
    }

    public void DeleteEmployee(Employee e) throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        PreparedStatement st = conn.prepareStatement(DELETE_Employee);
        st.setInt(1, e.getEmployeeID());
        st.executeUpdate();
    }

}

