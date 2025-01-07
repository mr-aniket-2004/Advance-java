import java.sql.*;

public class Slip5a {
    public static void main(String[] args) throws Exception {
        int len = args.length;
        if (len ==0) {
            System.out.println("plase enter the values for teacherno, teacher name , teacher salary , designation");
        }
        else{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url ="jdbc:mysql://localhost:3306/admin";
        String username = "root";
        String Password = "Admin";
        int id = Integer.parseInt(args[0]);
        String name = args[1];
        int salary = Integer.parseInt(args[2]);
        String degn = args[3];
        
        Connection con = DriverManager.getConnection(url, username, Password);
        String quary = "insert into teacher values(?,?,?,?)";

        PreparedStatement pst = con.prepareStatement(quary);

        pst.setInt(1, id);
        pst.setString(2, name);
        pst.setInt(3, salary);
        pst.setString(4, degn);
        pst.executeUpdate();
        System.out.println("Record added..");
        
        // con.commit();
        con.close();
        }
    }
}
