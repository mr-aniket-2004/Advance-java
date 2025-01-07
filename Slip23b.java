
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Slip23b {

    public static void main(String arg[]) throws Exception {
        int len = arg.length;
        if (len > 0) {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/tyjava";
            String uname = "root";
            String pwd = "root";

            Connection con = DriverManager.getConnection(url, uname, pwd);
            char ch = arg[0].charAt(0);
            if (ch == 'R' || ch == 'r') {
                String q = "select * from element";
                java.sql.Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(q);
                while (rs.next()) {
                    System.out.println("\n Id :  " + rs.getInt(1) + "\telement name: " + rs.getString(2) + "\t Automic no: " + rs.getInt(3) + "\t Sysbol: " + rs.getString(4));
                }
            }
            else if(ch== 'U'||ch =='u'){
                String nm = arg[1];
                String symbol = arg[2];
                String q = "update element set symbol = ? where ename = ?";
                PreparedStatement pst = con.prepareStatement(q);
                pst.setString(1,symbol);
                pst.setString(2,nm);
                int n = pst.executeUpdate();
                if (n==0) {
                    System.out.println("Record not found");
                }
                else{
                    System.out.println("Record update successfully");
                }


            }
            else if(ch== 'D'||ch =='d'){
                String nm = arg[1];
                String q = "delete from element where ename = ?";
                PreparedStatement pst = con.prepareStatement(q);
                pst.setString(1,nm);
                int n = pst.executeUpdate();
                if (n==0) {
                    System.out.println("Record not found");
                }
                else{
                    System.out.println("Record Deletedf successfully");
                }


            }
            con.close();
        } else {
            System.out.println("Enter the Oparation : R/U/D");
        }

    }
}
