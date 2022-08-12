<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--<%@ page import="static Interfaces.UserInterface.*" %>--%>
<%--<%@ page import="Classes.News" %>--%>
<%--<%@ page import="static Interfaces.NewsInterface.*" %>--%>
<%--<%@ page import="Servlets.NewsServlet"%>--%>
<%--<% EmailName.put(Admin.email, Admin.name);--%>
<%--   EmailPass.put(Admin.email, Admin.pass);--%>
<%--   News news1 = new News("Dynamo Kyiv wins...", "President ...", "Sport", "08.05.21");--%>
<%--   News news2 = new News("Rivne`s zoo is closed...", "aslallasl", "Animals", "08.05.21");--%>
<%--   News news3 = new News("Election 2020", "aslalsldfals ", "Politics", "08.05.21");--%>
<%--   News news4 = new News("Scientists shock us again.. ", "sasflkm", "Science", "13.05.2021");--%>
<%--   News news5 = new News("KPI is opened again...", "asfk", "Education", "13.05.2021");--%>
<%--   AllNews.add(n)--%>
<%--%>--%>
<!DOCTYPE html>
<html>
    <head>
        <title>NewsPaper</title>
    </head>
    <body class="bg">
        <link rel="stylesheet" type="text/css" href ="style.css"/>
        <form action="SearchResultServlet" method="get">
        <input type="search" style="text-align: center"/>
        <input type="submit" value="Search" onclick="document.forms[0].action = 'SearchResultS.jsp';
            return true;"/><br/>
        <button class="circle" onclick="document.forms[0].action = 'CreateNewsS.jsp'">+</button>

            <br style="text-align: center">

            <br/><br/>
        </form>
        <div class="split left">

            <div class="href"><a href="RegisterS.jsp">Sport</a></div><br/><br/>
            <div class="href"><a href="RegisterS.jsp">Animals</a></div><br/><br/>
            <div class="href"><a href="RegisterS.jsp">Politics</a></div><br/><br/>
            <div class="href"><a href="RegisterS.jsp">Science</a></div><br/><br/>
            <div class="href"><a href="RegisterS.jsp">Education</a></div><br/><br/>
            </div>
        <div class="bg"><jsp:include page="NewsS.jsp"/></div>

        <div class="split right">
            <div class="href"><a href="LoginS.jsp">Enter Account</a></div>
        </div>
    </body>
    </html>