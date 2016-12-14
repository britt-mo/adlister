<%--
  Created by IntelliJ IDEA.
  User: brittmo
  Date: 12/13/16
  Time: 2:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test='${param.username.equals("admin") && param.password.equals("password")}'>
    <c:redirect url="profile.jsp" />
</c:if>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="partials/navbar.jsp" />

<form method="POST" action="login.jsp">
    <div>
        <label for="username">Username</label>
        <input id="username" name="username" type="text">
    </div>
    <div>
        <label for="password">Password</label>
        <input id="password" name="password" type="password">
    </div>
    <div>
        <input type="submit">
    </div>
</form>

<jsp:include page="partials/footer.jsp" />
</body>
</html>
