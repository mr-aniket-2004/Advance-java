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
    String num = request.getParameter("num");
    // out.println("<h2> The number : </h2>"+num);
    int n = Integer.parseInt(num);
    int temp;
    for(int i =1;i<=n;i++){
         temp = 0;
        for(int j =2;j<=Math.sqrt(i);j++){
            if(i%j==0){
            temp=1;
            break;
            }
        }
        if(temp==0){
            out.println("<p style='color:blue'> The number :"+i+" </p>");
        }   
    }
    
    
    %>
</body>
</html> 