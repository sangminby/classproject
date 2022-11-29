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

  <title>Todo List</title>

  <style>

    td{
      padding: 10px;
      text-align: center;
    }

  </style>

</head>
<body>

  <h1>${title}</h1>

  <table>

    <tr>

      <td>번호</td>
      <td>할일</td>
      <td>기간</td>
      <td>완료여부</td>

    </tr>

    <c:forEach var="todo" items="${testlist}" varStatus="stat">

      <tr>

        <td>${todo.tno}</td>
        <td><a href="/testtodo/read?tno=${todo.tno}">${todo.todo}</a></td>
        <td>${todo.dueDate}</td>
        <td>${todo.finished ? '완료' : '진행중'}</td>

      </tr>

    </c:forEach>

  </table>

  <a href="/testtodo/register">Todo 등록하기</a> <a href="/index">돌아가기</a>
  <hr>

  <div style="margin-top: 10px">

    <form>

      날짜검색
        <select name="searchType">

          <option value="dueDate">날짜</option>

        </select>

      <input type="date" name="keyword" value="dueDate">
      <input type="submit" name="검색">

    </form>

  </div>

</body>
</html>