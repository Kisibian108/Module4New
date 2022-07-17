<%--
  Created by IntelliJ IDEA.
  User: truonglam
  Date: 7/14/22
  Time: 2:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h3>Setting Email</h3>
<form:form method="post" modelAttribute="email" action="/edit">
    <form:hidden path="id"/>
    <table>
        <tr>
            <td><form:label path="language">Languages:</form:label></td>
            <td><form:select path="language" items="${languageList}">
            </form:select></td>
        </tr>
        <tr>
            <td><form:label path="pageSize">Paper Size: <span style="margin-left: 10px">show</span></form:label></td>
            <td><form:select path="pageSize" items="${pageSizeList}">
            </form:select>
                <span>emails per page</span>
            </td>
        </tr>
        <tr>
            <td><form:label path="spamFilter">Spam Filter:</form:label></td>
            <form:checkbox path="spamFilter" /> Enable spams filter
        </tr>
        <tr>
            <td><form:label path="signature">Signature:</form:label></td>
            <td><form:textarea cssStyle="height: 50px;" path="signature"/>
            </td>
        </tr>
        <tr>
            <td></td>
            <td><form:button>Update</form:button></td>
            <td><form:button>Cancel</form:button></td>
        </tr>
    </table>
</form:form>
</body>
</html>


<%--<form:form method="post" modelAttribute="email" action="/update">--%>
<%--    <form:hidden path="id"/>--%>
<%--    <table>--%>
<%--        <tr>--%>
<%--            <th>Languages</th>--%>
<%--            <td>--%>
<%--                <form:select path="language" items="${languageArr}"/>--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <th>Page size:</th>--%>
<%--            <td>Show--%>
<%--                <form:select path="pageSize" items="${pageSizeArr}"/>--%>
<%--                emails per page--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <th>Spam filter:</th>--%>
<%--            <td>--%>
<%--                <form:checkbox path="spamFilter"/> Enable spams filter--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <th>Signature:</th>--%>
<%--            <td>--%>
<%--                <form:textarea path="signature"/>--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td></td>--%>
<%--            <td>--%>
<%--                <form:button>Update</form:button>--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--    </table>--%>
<%--</form:form>--%>
<%--</body>--%>
<%--</html>--%>