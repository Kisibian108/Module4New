<%--
  Created by IntelliJ IDEA.
  User: truonglam
  Date: 7/14/22
  Time: 2:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Calculator</h1>
  <form method="post">
      <input type="text" pattern="^\d*(\.\d{0,2})?$" required name="a" value="${a}">
      <input type="text" pattern="^\d*(\.\d{0,2})?$" required name="b" value="${b}">
      <input name="ope" value="+" type="submit">Additional + </input>
      <input name="ope" value="-" type="submit">Subtraction - </input>
      <input name="ope" value="*" type="submit">Multiplication X </input>
      <input name="ope" value="/" type="submit">Division / </input>
      <p>Result:${resultAdd}</p>
<%--    <input type = "submit" id = "submit" value = "save"/>--%>
  </form>
  </body>
</html>
