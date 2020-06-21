<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/6/21
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="book/findAll">测试查询</a>
    <h3>测试包</h3>

    <form action="book/save" method="post">
        图书名称：<input type="text" name="name" /><br/>
        数量：<input type="text" name="number" /><br/>
        <input type="submit" value="保存" /><br/>
    </form>
</body>
</html>
