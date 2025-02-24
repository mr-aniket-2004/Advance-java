<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Result</title>
    
</head>
<body>
    <%
        String num = request.getParameter("n");
        char f1 = num.charAt(0);
        char f2 = num.charAt(num.length()-1);
        int n1 = Integer.parseInt(f1+"");
        int n2 = Integer.parseInt(f2+"");
        int result = n1+n2;
        // out.println("<h2 style='color:red,fontsize:18'>The addiotion of Number :"+result+"</h2>");
     %>
     <p style="color: red;font-size: 18;">The Addiotion is <%= result %></p>
</body>
</html>