<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: truonglam
  Date: 7/16/22
  Time: 10:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--private Integer id;--%>
<%--private String name;--%>
<%--private int year;--%>
<%--private String gender;--%>
<%--private String national;--%>
<%--private int idCard;--%>
<%--private String travel;--%>
<%--private String idTravel;--%>
<%--private String chair;--%>
<%--private String startDate;--%>
<%--private String endDate;--%>
<%--private String infomation;--%>
<form:form method="post" modelAttribute="medical">
    <table>
        <tr>
            <td>Ho ten (ghi chu IN HOA)(*)</td>
            <form:input path="name"> </form:input>
        </tr>
        <tr>
            <td>Nam sinh(*)</td>
            <form:input path="year"> </form:input>
        </tr>
        <tr>
            <td>Nam sinh(*)</td>
            <form:input path="year"> </form:input>
        </tr>
        <tr>
            <td>Nam sinh(*)</td>
            <form:input path="year"> </form:input>
        </tr>
        <tr>
            <td>Nam sinh(*)</td>
            <form:input path="year"> </form:input>
        </tr>
        <tr>
            <td>Nam sinh(*)</td>
            <form:input path="year"> </form:input>
        </tr>
        <tr>
            <td>Nam sinh(*)</td>
            <form:input path="year"> </form:input>
        </tr>
        <tr>
            <td>Nam sinh(*)</td>
            <form:input path="year"> </form:input>
        </tr>
        <tr>
            <td>Nam sinh(*)</td>
            <form:input path="year"> </form:input>
        </tr>

    </table>

</form:form>

</body>
</html>
