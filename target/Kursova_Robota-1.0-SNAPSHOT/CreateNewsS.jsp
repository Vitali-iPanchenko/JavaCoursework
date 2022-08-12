<%@ page import="Servlets.CreateNewsServlet" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Create News</title>
</head>
<body>
<p>name: <%=request.getAttribute("name")%></p>
<link rel="stylesheet" type="text/css" href ="style.css"/>
<form action="CreateNewsServlet" method="get">

    <label>name:</label><input type="text"/><br/><br/>
    <label>content:</label><input type="text"/><br/><br/>
    <label>category:</label><input type="text"/><br/><br/>
    <label>date:</label><input type="text"/><br/><br/>
    <input type="submit" value="hah"/><br/><br/>

    <table>
        <tr >
<%--            <th><h3>Slim shady <%request.getServletContext().getAttribute("date");%></h3></th>--%>
        <th>Slim: ${why}</th>
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
