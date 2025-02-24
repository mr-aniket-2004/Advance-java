<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Details of Accounts</title>
</head>
<body>
    <%@ page import="java.sql.*"%>
    <%@ page import="java.io.*"%>

    <h1>Details of Account</h1>

    <%
    String s =request.getParameter("ANo");
    int ANo = Integer.parseInt(s);
    String Type =request.getParameter("Type");
    String Bal =request.getParameter("Bal");
    Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/admin";
        String username = "root";
        String password= "Admin";
        Connection con = DriverManager.getConnection(url, username, password);
        String query = "insert into account values(?,?,?)";
        String result = "select * from account";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, ANo);
        pst.setString(2, Type);
        pst.setString(3, Bal);
        pst.executeUpdate();
        // out.println("<p>Record Added");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(result);
        out.print("<table border='1'><th>Account No</th><th>Account Type</th><th>Balance</th>");
        while (rs.next()) {
            out.print("<tr>");
            out.print("<td style='width:300px'>"+rs.getInt(1)+"</td>");
            out.print("<td style='width:300px'>"+rs.getString(2)+"</td>");
            out.print("<td style='width:300px'>"+rs.getString(3)+"</td>");
            out.print("</tr>");
        }
        out.print("</table>");
    
    %>
</body>
</html>