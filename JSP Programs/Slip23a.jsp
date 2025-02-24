<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Result page</title>
    <style>
        table{
            border: 1px solid black;
        }
        table td {
            border: 1px solid black;
            width: 250px;
        }
        table th {
            border: 1px solid black;
            width: 250px;
        }
    </style>
</head>
<body>
<%
    String RollNo = request.getParameter("RNo");
    String sName = request.getParameter("SName");
    String gender = request.getParameter("Gender");
    String Knowledge = request .getParameter("Computer");
    String className = request.getParameter("class");



    

%>
<table>
    <tr>
        <th>Labels</th>
        <th>Details</th>
    </tr>
    <tr>
        <td>Student Name</td>
        <td><%= sName %></td>
    </tr>
    <tr>
        <td>Gender</td>
        <td><%= gender %></td>
    </tr>
    <tr>
        <td>Computer Knowledge</td>
        <td><%= Knowledge %></td>
    </tr>
    <tr>
        <td>Class Name</td>
        <td><%= className %></td>
    </tr>
    

</table>
    

</body>
</html>