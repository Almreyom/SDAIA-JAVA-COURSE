package s4;
import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\untitled2\\src\\main\\java\\org\\example\\hr.db";
        String query = "select * from Jobs ";


        try (Connection conn = DriverManager.getConnection(url);) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                jobs j = new jobs(rs);
                System.out.println(j);

            }

        }
    }
}