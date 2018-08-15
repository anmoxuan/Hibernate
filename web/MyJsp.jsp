<%--
  Created by IntelliJ IDEA.
  User: 丶安沫轩
  Date: 2018/8/15
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="StudentServlet.do?method=add" method="post">
        编号：<input type="hidden" name="sid" value="${listOne.sid}">
        姓名：<input value="${listOne.sname}" name="sname"><br>
        年龄：<input value="${listOne.age}" name="age"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
