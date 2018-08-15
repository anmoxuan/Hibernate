<%--
  Created by IntelliJ IDEA.
  User: 丶安沫轩
  Date: 2018/7/21
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
    <style>
      tr td{
        text-align: center;
      }
    </style>
  </head>
  <body>
    <a href="MyJsp.jsp"><h1>增加学生</h1></a>
    <table border="1" cellspacing="0" width="80%">
      <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>操作</td>
      </tr>
      <c:forEach items="${list}" var="temp">
        <tr>
          <td>${temp.sid}</td>
          <td>${temp.sname}</td>
          <td>${temp.age}</td>
          <td>
            <a href="StudentServlet.do?method=delete&sid=${temp.sid}">删除</a>&nbsp;&nbsp;
            <a href="StudentServlet.do?method=findOne&sid=${temp.sid}">修改</a>
          </td>
        </tr>
      </c:forEach>
    </table>
  </body>
</html>
