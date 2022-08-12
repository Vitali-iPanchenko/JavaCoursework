<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>Search Result</title>
</head>
<body>
        <form action="SearchResultServlet" method="post">
<%--            <% String term = (String)session.getAttribute("Search"); %>--%>
            <h1>${requestScope}</h1>
        </form>
</body>
</html>
