import java.sql.*;
import java.util.*;

public class Slip10a {
    public static void main(String[] args) throws Exception {
        int cnt=0;
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url ="jdbc:mysql://localhost:3306/admin";
        String username = "root";
        String Password = "Admin";
        Scanner sc = new Scanner(System.in);
        System.out.println("\n the present table is -- 1.employee\n2.teacher\nenter the table name you wish to knwon the count of records--\n");
        String name = sc.nextLine();
        
        Connection con = DriverManager.getConnection(url, username, Password);
        String quary = "select * from  "+name;
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(quary);
        while (rs.next()) {
            cnt++;
        }
        System.out.println("the count of records present in table---"+cnt);
        // con.commit();
        con.close();
    }
}
