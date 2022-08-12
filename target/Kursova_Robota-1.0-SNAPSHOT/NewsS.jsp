<%@ page import="Servlets.NewsServlet" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>

<html>
<head>
    <title>News</title>
</head>
<body>
        <link rel="stylesheet" type="text/css" href ="style.css"/>
        <form action="NewsServlet" method="post">
            <table>
                <tr >
                    <th>My name is Vasya</th>
                </tr>
                <tr>
                    <td style="text-align: left">sobaka dyka vse ispachkala</td>
                    <td><a href="RegisterS.jsp">Animals</a></td>
                    <td><b>13.05.21</b></td>
                </tr>
            </table>
        </form>
</body>
</html>
