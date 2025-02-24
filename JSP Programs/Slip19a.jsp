<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Result Pages</title>
</head>
<body>
    <%
    out.println("<h2> JSP Programe to print NUMBER into WORDS</h2>");
    String num = request.getParameter("t1");
    out.println("<h2> The number : </h2>"+num);

    for(int i =0;i<=num.length()-1;i++){
        char ch = num.charAt(i);
        switch(ch){
            case '0': out.print("<br> Zero");break;
            case '1': out.print("<br> One");break;
            case '2': out.print("<br> Two");break;
            case '3': out.print("<br> Three");break;
            case '4': out.print("<br> Four");break;
            case '5': out.print("<br> Five");break;
            case '6': out.print("<br> Six");break;
            case '7': out.print("<br> Seven");break;
            case '8': out.print("<br> Eigth");break;
            case '9': out.print("<br> Nine");break;

        }
    }
    %>
</body>
</html> 