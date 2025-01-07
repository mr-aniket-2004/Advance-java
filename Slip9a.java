import java.sql.*;

public class Slip9a {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url ="jdbc:mysql://localhost:3306/admin";
        String username = "root";
        String Password = "Admin";
        
        Connection con = DriverManager.getConnection(url, username, Password);
        String quary = "delete from employee where ename like 'a%'";

        Statement st = con.createStatement();
        int result = st.executeUpdate(quary);
        if (result==0) {
            System.out.println("Record not found");
        }
        else{
            System.out.println("Record Deleted");
        }
        // con.commit();
        con.close();
    }
}
