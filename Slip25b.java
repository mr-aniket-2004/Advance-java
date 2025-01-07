import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class Slip25b
{
	public static void main (String arg[])throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/tyjava";
		String uname="root";
		String pwd="root";
		
		Connection con=DriverManager.getConnection(url,uname,pwd);
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		
		String q="select * from emplyee";
		ResultSet rs=st.executeQuery(q);
        int n;
		do { 
            System.out.println(" 1. move First");
            System.out.println(" 2. move next");
            System.out.println(" 3. move previous");
            System.out.println(" 4. move last");
            System.out.println(" 5. Exit");
            System.out.println(" Enter the Choice : ");
            Scanner sc  = new Scanner(System.in);
             n = sc.nextInt();
            switch (n) {
                case 1:rs.first();
                System.out.println("Display frist Record");
                break;
                case 2:if (!rs.isLast()) {
                    rs.next();
                    System.out.println("Display Next Record"); 
                }
                else{
                    System.out.println("Already at last record");
                }
                break;
                case 3:if (!rs.isFirst()) {
                    rs.previous();
                    System.out.println("Already at Frist record");    
                }
                
                break;
                case 4:rs.last();
                System.out.println("Display last Record");
                break;
            }
            System.out.println("----------------------------------------------------------------------");
            System.out.println("\n Eid: "+rs.getInt(1)+"\trs: "+rs.getString(2)+"\t salary: "+rs.getInt(3));
        } while (n!=5);
		con.close();
	}
}

//java -cp .;"D:\Adv_Java\mysql-connector-j-9.1.0\mysql-connector-j-9.1.0.jar" Slip3a