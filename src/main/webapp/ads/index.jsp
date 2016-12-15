<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Ads Index</title>
</head>
<body>
<h1>Ads Index</h1>
<c:forEach var="ads" items="${ads}">
    <h1>${ads.title}</h1>
    <p>${ads.description}</p>
</c:forEach>

</body>
</html>
