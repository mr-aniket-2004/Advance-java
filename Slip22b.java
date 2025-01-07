import java.sql.*;
import java.util.*;

public class Slip22b {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url ="jdbc:mysql://localhost:3306/admin";
        String username = "root";
        String Password = "Admin";
        
        Connection con = DriverManager.getConnection(url, username, Password);
        Statement st = con.createStatement();
        String quary = "create table new_student(rno int AUTO_INCREMENT,name varchar(55),per int(10),primary key(rno))";
        st.executeUpdate(quary);// plase execute above 2 line only once 
        System.out.println("table Created");
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the roll no -");
        int rollno = sc.nextInt();
        System.out.println("Enter the name --");
        String name = sc1.nextLine();
        
        System.out.println("Enter the percentage --");
        int per = sc.nextInt();

        String insertQuery = "insert into new_student values(?,?,?)";
        PreparedStatement pst = con.prepareStatement(insertQuery);
        pst.setInt(1, rollno);
        pst.setString(2, name);
        pst.setInt(3, per);
        pst.executeUpdate();
        System.out.println("Record inserted ");

        String display = "Select * from new_student";
        ResultSet rs = st.executeQuery(display);
        while (rs.next()) {
            System.out.println("Roll No --"+rs.getInt(1)+"\t Name --"+rs.getString(2)+"\t Percentage--"+rs.getInt(3));
        }
        System.out.println("Display all record");
        con.close();
        
    }
}
