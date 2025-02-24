<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Result Pages</title>
</head>
<body>
    <%
    out.println("<h2> JSP Programe to print Prime Numbers </h2>");
    String name = request.getParameter("name");
    out.println("<h2> Name of User : </h2>"+name);
    String str  = request.getParameter("age");
    // out.println("<h2> Name of User : </h2>"+str);
    int n = Integer.parseInt(str);
    // int n =18;
    if(n>=18){
        out.println("<h2 style='color:green'> Your are Eligible for Voting </h2>");
    }
    else{
        out.println("<h2 style='color:red'> Your are Not Eligible for Voting </h2>");
    }
    
    
    %>
</body>
</html> 