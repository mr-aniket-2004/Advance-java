import java.sql.*;
import java.util.*;

public class Slip15a {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url ="jdbc:mysql://localhost:3306/admin";
        String username = "root";
        String Password = "Admin";
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("\n Enter the id--\n");
        int id = sc.nextInt();
        System.out.println("\n Enter the address--\n");
        String address = sc1.nextLine();

        
        Connection con = DriverManager.getConnection(url, username, Password);
        String demo = "select * from customer";
        String quary = "update customer set Address = ? where cid =?";
        String result = "select * from customer";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(demo);
        System.out.println("records before update--\n");
        while (rs.next()) {
            System.out.println("id --"+rs.getInt(1)+"\tname--"+rs.getString(2)+"\t Address --"+rs.getString(3)+"\t");
        }
        PreparedStatement pst = con.prepareStatement(quary);
        pst.setString(1, address);
        pst.setInt(2, id);
        pst.executeUpdate();
        System.out.println("record after updated--\n");
        ResultSet finalresult =st.executeQuery(result);
        while (finalresult.next()) {
            System.out.println("id --"+finalresult.getInt(1)+"\tname--"+finalresult.getString(2)+"\t Address --"+finalresult.getString(3)+"\t");
        }
        con.close();
    }
}
