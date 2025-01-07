import java.sql.*;

public class Slip3a {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url ="jdbc:mysql://localhost:3306/admin";
        String username = "root";
        String Password = "Admin";
        
        Connection con = DriverManager.getConnection(url, username, Password);
        String quary = "select * from employee where dept like 'computerscience'";

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(quary);
        while (rs.next()) {
            System.out.println("no of emp :"+rs.getInt(1)+"\t name of emp : "+rs.getString(2)+"\t dept of emp : "+rs.getString(3)+"\t Salary of emp : "+rs.getInt(4));
        }
        // con.commit();
        con.close();
    }
}