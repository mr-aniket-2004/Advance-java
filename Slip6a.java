import java.sql.*;
import java.util.*;

public class Slip6a {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/admin";
        String username = "root";
        String password= "Admin";
        Scanner sc = new Scanner(System.in);
        Scanner Sc1 = new Scanner(System.in);
        Scanner Sc2 = new Scanner(System.in);
        System.out.println("Enter the customer id --\n");
        int id = sc.nextInt();
        System.out.println("Enter the customer name --\n");
        String name = Sc1.nextLine();
        System.out.println("Enter the customer address --\n");
        String Adresss = Sc1.nextLine();
        System.out.println("enter the mobile no --\n");
        int phone = Sc2.nextInt();

        Connection con = DriverManager.getConnection(url, username, password);
        String query = "insert into customer values(?,?,?,?)";
        String result = "select * from customer";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, id);
        pst.setString(2, name);
        pst.setString(3, Adresss);
        pst.setInt(4, phone);
        pst.executeUpdate();
        System.out.println("Record Added");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(result);
        while (rs.next()) {
            System.out.println("id - "+rs.getInt(1)+"\tname -"+rs.getString(2)+"\tAdress - "+rs.getString(3)+"\tPhone no -"+rs.getInt(4));
        }
        con.close();


    }
}
