<%--
  Created by IntelliJ IDEA.
  User: 潘靖
  Date: 2018/11/7
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <center>
        <h3>
            <div>
                <a href="/emp/add.do">添加</a>
            </div>
            <table>
                <tr>
                    <td>用户名：</td>
                    <td>职位：</td>
                    <td>工资：</td>
                    <td>入职日期：</td>
                    <td>操作：</td>
                </tr>
                <c:forEach items="${empList}" var="emp">
                    <tr>
                        <td>${emp.EMPNO}</td>
                        <td>${emp.JOB}</td>
                        <td>${emp.SAL}</td>

                        <td>${emp.HIREDATE}</td>
                        <td><a href="/emp/getById.do?empNo=${emp.EMPNO}">修改</a>&nbsp;<a href="/emp/delete.do?empNo=${emp.EMPNO}">删除</a></td>
                    </tr>
                </c:forEach>
                <tr><td colspan="4">${stringPage}</td></tr>
            </table>
        </h3>
    </center>
</body>
</html>
