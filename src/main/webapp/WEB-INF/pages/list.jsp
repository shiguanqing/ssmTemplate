<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/6/21
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h3>查询所有的馆藏图书</h3>

    <c:forEach items="${list}" var="book">
        ${book.bookId}
        ${book.name}
        ${book.number}
        <br />
    </c:forEach>

</body>
</html>
