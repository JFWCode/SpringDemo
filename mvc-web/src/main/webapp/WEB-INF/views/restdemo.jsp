<%--
  Created by IntelliJ IDEA.
  User: wangke
  Date: 5/20/21
  Time: 5:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <div>
    <form action="/api/testRestful" method="post">
      <input type="text" name="id" value="12">
      <input type="submit" value="Post">
    </form>

    <form action="/api/testRestful/1" method="post">
      <input type="hidden" name="_method" value="PUT">
      <input type="submit" value="Put">
    </form>

    <form action="/api/testRestful/2" method="post">
      <input type="hidden" name="_method" value="DELETE">
      <input type="submit" value="Delete">
    </form>
  </div>

</body>
</html>
