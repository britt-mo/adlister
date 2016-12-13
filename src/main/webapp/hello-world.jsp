<%--
  Created by IntelliJ IDEA.
  User: brittmo
  Date: 12/13/16
  Time: 9:36 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%! int counter = 0; %>
<% counter += 1; %>
<html>
<head>
    <title>Hello World from JSP</title>
    <link href="css/style.css" rel="stylesheet">
</head>
<body>
<%@ include file="navigation.jsp" %>
<h1>Hello ${param.name}</h1>
<h2>
    You have viewed this page <small><%= counter %></small> times!
</h2>
</body>
</html>
