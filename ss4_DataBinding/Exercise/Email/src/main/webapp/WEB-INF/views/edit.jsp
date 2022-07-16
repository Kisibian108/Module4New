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
<form:form method="post" modelAttribute="email">
    <table>
        <tr>
            <td><form:label path="language">Languages:</form:label></td>
            <td><form:select path="language" items="${languagelist}">
            </form:select></td>
        </tr>
        <tr>
            <td><form:label path="pageSize">Paper Size: <span style="margin-left: 10px">show</span></form:label></td>
            <td><form:select path="pageSize" items="${papersize}">
            </form:select>
                <span>emails per page</span>
            </td>
        </tr>
        <tr>
            <td><form:label path="spamFilter">Spam Filter:</form:label></td>
            <td><form:checkboxes path="spamFilter" items="${enable}"/></td>
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
