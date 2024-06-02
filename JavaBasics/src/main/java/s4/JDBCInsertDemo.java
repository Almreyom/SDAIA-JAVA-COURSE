package s4;
import java.sql.*;
import java.util.Scanner;
public class JDBCInsertDemo {
    public static void main(String []strings) throws SQLException{
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\SDAIA-Java-Course-master\\JavaBasics\\src\\main\\java\\s4\\hr.db";
        String query = "insert into jobS values(?,?,?, ?)";

        try (Connection conn = DriverManager.getConnection(url);){
            PreparedStatement st = conn.prepareStatement(query);
            System.out.println("enter job ID:");
            int job_ID = sc.nextInt();
            st.setInt(1,job_ID);
            sc.nextInt();

            System.out.println("enter job title:");
            String job_title = sc.nextLine();
            st.setString(2,job_title);
            sc.nextLine();

            System.out.println("enter min salary:");
            int min_salary = sc.nextInt();
            st.setInt(3,min_salary);
            sc.nextInt();

            System.out.println("enter max salary:");
            int max_salary = sc.nextInt();
            st.setInt(3,max_salary);
            sc.nextInt();

            int row = st.executeUpdate();
            System.out.println(row +"insert update");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
