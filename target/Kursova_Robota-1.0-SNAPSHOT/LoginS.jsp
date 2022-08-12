<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>Login Form</title>
</head>
<body class="bg">
<link rel="stylesheet" type="text/css" href ="style.css"/>

<div class="split left"></div>

<form action="LoginServlet" method="get"><div class="input">

    <label>Email:</label><input type="email" name="UserEmail"/><br/><br/>
    <label>Pass:</label><input type="password" name="UserPass"/><br/><br/>

</div>

    <input type="submit" value="Login"/>

    <a href="RegisterS.jsp">Create An Account</a>

<div class="split right"></div>

</form>
</body>
</html>
