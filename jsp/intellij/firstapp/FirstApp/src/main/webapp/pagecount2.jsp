<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-08
  Time: 오후 3:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

  <%
    String cntstr = (String) application.getAttribute("cnt");
    int cnt = cntstr == null ? 0 : Integer.parseInt(cntstr);

    out.print("페이지 방문 수 :" + cnt);

  %>

</body>
</html>
