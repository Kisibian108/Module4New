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
  <h1>SandWitch Condiments</h1>
  <form method="post">
   <label>Lettuce<input type="checkbox" value="Lettuce" name="condiment" ></label>
   <label>Tomato <input type="checkbox" value="Tomato" name="condiment"></label>
    <label>Mustard<input type="checkbox" value="Mustard" name="condiment"></label>
    <label>Sprouts<input type="checkbox" value="Sprouts" name="condiment"></label>
    <p>${name}</p>
    <input type = "submit" id = "submit" value = "save"/>
  </form>
  </body>
</html>
