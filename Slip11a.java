import java.sql.*;


public class Slip11a {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url ="jdbc:mysql://localhost:3306/admin";
        String username = "root";
        String Password = "Admin";
        
        Connection con = DriverManager.getConnection(url, username, Password);
        Statement st = con.createStatement();
        String quary = "alter table Student drop column percentage";
        st.executeUpdate(quary);
        con.close();
        System.out.println("Column Deleted");
    }
}
