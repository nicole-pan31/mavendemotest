<%--
  Created by IntelliJ IDEA.
  User: 潘靖
  Date: 2018/11/7
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <form action="/emp/updata.do">
        <h3>

            <table>
                <tr>
                    <td>ID：</td>
                    <td>职位：</td>
                    <td>工资：</td>
                    <td>姓名：</td>
                    <td>MGR：</td>
                    <td>入职日期：</td>
                    <td>奖金：</td>
                    <td>部门ID：</td>
                </tr>


                    <tr>

                        <td><input type="text" name="empNo" value="${empGetById.EMPNO}"></td>

                        <td><input type="text" name="job" value="${empGetById.JOB}"></td>
                        <td><input type="text" name="sal" value="${empGetById.SAL}"></td>
                        <td><input type="text" name="ename" value="${empGetById.ENAME}"></td>
                        <td><input type="text" name="mgr" value="${empGetById.MGR}"></td>
                        <td><input type="text" name="hiredate" value="${empGetById.HIREDATE}"></td>
                        <td><input type="text" name="comm" value="${empGetById.COMM}"></td>
                        <td><input type="text" name="deptNo" value="${empGetById.DEPTNO}"></td>

                    </tr>

                <td><input type="submit" value="更新"/></td>
            </table>
        </h3>
    </form>

</center>
</body>
</html>
