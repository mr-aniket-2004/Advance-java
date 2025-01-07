import java.sql.*;

public class Slip27a {
    public static void main(String[] args) throws Exception {
        int len = args.length;
        if (len ==0) {
            System.out.println("plase enter the values for emp id");
        }
        else{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url ="jdbc:mysql://localhost:3306/admin";
        String username = "root";
        String Password = "Admin";
        int id = Integer.parseInt(args[0]);
       
        
        Connection con = DriverManager.getConnection(url, username, Password);
        String quary = "delete from employee where eno="+id;
        Statement st = con.createStatement();
        int n = st.executeUpdate(quary);
       
        if (n ==0) {
            System.out.println("record not found");
        }
        else{
            System.out.println("Record deleted");
        }
        
        con.close();
        }
    }
}
