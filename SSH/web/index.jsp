<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Technodrive
  Date: 25.02.13
  Time: 13:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Start_PAGE</title>
</head>
<body>
<table align="center">

    <tr>
        <td>
            <h1>
                Start page of the CRUD application
            </h1>
        </td>
    </tr>
    <tr>
        <td>
            <a href="/crud/Crud.action"><h1>Show all student</h1></a>
        </td>
    </tr>
    <tr>
        <td>
            <a href="/crud/PageCreate.action"><h1>Create new student</h1></a>
        </td>
    </tr>
</table>

</body>
</html>