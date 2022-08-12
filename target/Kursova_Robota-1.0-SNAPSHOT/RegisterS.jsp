<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>Registration Form</title>
</head>
<body class="bg">
<link rel="stylesheet" type="text/css" href ="style.css"/>
    <div class="split left">

    </div>

    <form action="RegisterServlet" method="get"><div class="input">

    <label>Name:</label><input type="text" name="UserName"/><br/><br/>
    <label>Email:</label><input type="email" name="UserEmail"/><br/><br/>
    <label>Pass:</label><input type="password" name="UserPass"/><br/><br/>
    <label>Repeat Pass:</label><input type="password" name="UserPassRep"/><br/><br/>

    </div>

        <input type="submit" value="Register"/>

        <a href="LoginS.jsp">Already Registered?</a>

    <div class="split right">

    </div>
</form>
</body>
</html>
