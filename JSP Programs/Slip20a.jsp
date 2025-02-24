<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hospital Details</title>
</head>

<body>
    <%@ page import="java.sql.*" %>
        <%@ page import="java.io.*" %>

            <% Class.forName("com.mysql.cj.jdbc.Driver"); 
                String url="jdbc:mysql://localhost:3306/admin" ; 
                String username="root" ; 
                String Password="Admin" ; 
                String q="select * from hospital" ; 
                Connection con=DriverManager.getConnection(url,username,Password); 
                Statement st=con.createStatement(); 
                ResultSet rs=st.executeQuery(q);
                out.print("<table border='1'><th>HospitalNo</th><th>Hospital Name</th><th>Address</th>");
                while(rs.next()){
                out.print("<tr>");
                out.print("<td>"+rs.getInt(1)+"</td>");
                out.print("<td>"+rs.getString(2)+"</td>");
                out.print("<td>"+rs.getString(3)+"</td>");
                out.print("</tr>");
                }
                out.print("</table>");

                %>
</body>

</html>