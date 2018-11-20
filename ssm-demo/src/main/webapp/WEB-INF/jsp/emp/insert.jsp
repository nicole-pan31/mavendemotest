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
    <form action="/emp/insert.do">

        <h3>

            <table>
                <tr>
                    <td hidden="hidden">ID：</td>
                    <td>职位：</td>
                    <td>工资：</td>
                    <td>姓名：</td>
                    <td>MGR：</td>
                    <td>入职日期：</td>
                    <td>奖金：</td>
                    <td>部门ID：</td>
                </tr>


                    <tr>
                        <td hidden="hidden"><input type="text" name="empNo" value=""></td>

                        <td><input type="text" name="job" value=""></td>
                        <td><input type="text" name="sal" value=""></td>

                        <td><input type="text" name="ename" value=""></td>
                        <td><input type="text" name="mgr" value=""></td>
                        <td><input type="text" name="hiredate" value=""></td>
                        <td><input type="text" name="comm" value=""></td>
                        <td><input type="text" name="deptNo" value=""></td>




                    </tr>

                <td><input type="submit" value="添加"/></td>
            </table>
        </h3>
    </form>

</center>
</body>
</html>
