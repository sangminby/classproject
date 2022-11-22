<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-11
  Time: 오전 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

  <title>Todo Register</title>

  <style>

    body {
      line-height: 250%;
    }

  </style>

</head>
<body>

  <h1>Todo Modify</h1>

  <form action="/testtodo/modify" method="post">

    <table>

      <tr>

        <td>번호</td>
        <td><input type="text" name="tno" value="${param.tno}" readonly></td>

      </tr>

      <tr>

        <td>할일</td>
        <td><input type="text" name="todo" value="${todo.todo}"></td>

      </tr>

      <tr>

        <td>기한</td>
        <td><input type="date" name="dueDate" value="${todo.dueDate}"></td>

      </tr>

      <tr>

        <td>상태</td>
        <td><input type="checkbox" name="finished" value="1" ${todo.finished ? 'checked' : ''}></td>

      </tr>

      <tr>

        <td></td>
        <td>

          <input type="reset">
          <input type="submit" value="수정">

        </td>

      </tr>

    </table>

  </form>

  <form action="/testtodo/remove" method="post">

    <input type="hidden" name="tno" value="${param.tno}">
    <input type="submit" value="삭제">

  </form>

  <a href="/testtodo/list">Todo List</a>

</body>
</html>
