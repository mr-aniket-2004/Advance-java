import java.sql.*;
import java.util.*;

public class Slip13a {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/admin";
        String username = "root";
        String password= "Admin";
        Scanner sc = new Scanner(System.in);
        Scanner Sc1 = new Scanner(System.in);
        Scanner Sc2 = new Scanner(System.in);
        System.out.println("Enter the model no --\n");
        int id = sc.nextInt();
        System.out.println("Enter the company name --\n");
        String name = Sc1.nextLine();
        System.out.println("Enter the  price --\n");
        int price = sc.nextInt();
        System.out.println("enter the colour --\n");
        String colour = Sc1.nextLine();

        Connection con = DriverManager.getConnection(url, username, password);
        String query = "insert into mobile values(?,?,?,?)";
        String result = "select * from mobile";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, id);
        pst.setString(2, name);
        pst.setInt(3, price);
        pst.setString(4, colour);
        pst.executeUpdate();
        System.out.println("Record Added");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(result);
        while (rs.next()) {
            System.out.println("id - "+rs.getInt(1)+"\tCompany_name -"+rs.getString(2)+"\tprice - "+rs.getInt(3)+"\tColour -"+rs.getString(4));
        }
        con.close();


    }
}
