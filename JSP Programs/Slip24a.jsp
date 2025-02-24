<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Email Verification</h1>
    <%
        String email = request.getParameter("email");
        char ch ;
        int ch1=0;
        int  ch2= 0;
        for(int i =0;i<email.length();i++){
            ch= email.charAt(i);
            if(ch=='@'){
                ch1++;
            }
            else if(ch =='.'){
                ch2++;
            }
        }

        if(ch1==1&&ch2>=1){
            out.print("<h2 style='color:green'>THIS EMAIL IS VALID TO USE");
        }
        else{
            out.print("<h2 style='color:red'>THIS EMAIL IS NOT VALID TO USE");
            out.print("<p>The Reason is ---<br>");
            out.print("<p>The count of @ is"+ ch1+" which is not allowed <br>");
            out.print("<p> Minimum . one is compalsary <br>");
            
        }
    %>
</body>
</html>