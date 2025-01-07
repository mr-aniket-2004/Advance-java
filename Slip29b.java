import java.sql.*;
import java.util.*;


public class Slip29b {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url ="jdbc:mysql://localhost:3306/admin";
        String username = "root";
        String Password = "Admin";
        Connection con = DriverManager.getConnection(url, username, Password);
        PreparedStatement pst;
        ResultSet rs;
        String q;
        int ch ;
        do {
            System.out.println("1.Insert \n 2.Update \n 3. Delete\n 4.Search \n 5.Display \n 6. Exit");
            System.out.println(("Enter the Choice --"));
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    q= "insert into new_student values(107,'guru',99)";
                    pst =con.prepareStatement(q);
                    pst.executeUpdate();
                    System.out.println("------------------------------------------------");
                    System.out.println("Record inserted Successfully");
                    System.out.println("------------------------------------------------");
                    break;
                
                case 2 :
                    System.out.println("enter the roll no to update record");
                    int n = sc.nextInt();
                    System.out.println("Enter the name --");
                    Scanner sc1 = new Scanner(System.in);
                    String name = sc1.nextLine();
                    q= "update new_student set name =? where rno =?";
                    pst=con.prepareStatement(q);
                    pst.setString(1, name);
                    pst.setInt(2, n);
                    pst.executeUpdate();
                    System.out.println("------------------------------------------------");
                    System.out.println("Record Update Successfully");
                    System.out.println("------------------------------------------------");
                    break;
                
                case 3 :
                    System.out.println("enter the roll no to delete  record");
                    int no = sc.nextInt();
                    q= "delete from new_student where rno= ?";
                    pst=con.prepareStatement(q);
                    pst.setInt(1, no);
                    pst.executeUpdate();
                    System.out.println("------------------------------------------------");
                    System.out.println("Record Deleted Successfully");
                    System.out.println("------------------------------------------------");
                    break;

                case 4:1111111
                    System.out.println("Enter the id wish to see record");
                    int rno = sc.nextInt();
                    q= "select * from new_student where rno=?";
                    pst=con.prepareStatement(q);
                    pst.setInt(1, rno);
                    rs =pst.executeQuery();
                    if (rs.next()) {
                        System.out.println("------------------------------------------------------------------------------------");
                        System.out.println("Roll no -"+rs.getInt(1)+"\t Student name -"+rs.getString(2)+"\t Percentage -"+rs.getInt(3));
                        System.out.println("-------------------------------------------------------------------------------------");
                    }
                    else{
                        System.out.println("Records not Found");
                    }
                    break;
                case 5:
                    System.out.println("All Records");
                    q= "select * from new_student";
                    pst=con.prepareStatement(q);
                    rs =pst.executeQuery();
                    while (rs.next()) {
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Roll no -"+rs.getInt(1)+"\t Student name -"+rs.getString(2)+"\t Percentage -"+rs.getInt(3));
                        System.out.println("------------------------------------------------");
                    }
                    
                    break;
                default:
                    break;
            }
            
        } while (ch!=6);

    }
}
