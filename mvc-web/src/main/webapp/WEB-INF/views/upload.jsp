<%--
  Created by IntelliJ IDEA.
  User: wangke
  Date: 5/20/21
  Time: 11:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>estUpload</title>
</head>
<body>
    <div>
        <h3>upload file</h3>
        <form action="/uploadFile" method="post" enctype="multipart/form-data">
            <input type="file" name="file"></input>
            <input type="submit" value="Submit">
        </form>

        <h3>upload multiple files</h3>
        <form action="/uploadMultiFiles" method="post" enctype="multipart/form-data">
            <input type="file" name="files" multiple></input>
            <input type="submit" value="Submit">
        </form>
    </div>
</body>
</html>
