<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-24
  Time: 오후 4:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

  <h1>사원 리스트</h1>
  <hr>

  <table border="1">

    <tr>

      <th>사원번호</th>
      <th>사원이름</th>
      <th>직책</th>
      <th>관리번호</th>
      <th>입사일</th>
      <th>연봉</th>
      <th>보너스</th>
      <th>부서번호</th>
      <th>관리</th>


    </tr>

    <c:forEach items="${empList}" var="emp">

      <tr>

        <td>${emp.empno}</td>
        <td>${emp.ename}</td>
        <td>${emp.job}</td>
        <td>${emp.mgr}</td>
        <td>${emp.hiredate}</td>
        <td>${emp.sal}</td>
        <td>${emp.comm}</td>
        <td>${emp.deptno}</td>
        <td><a href="/emp/modify?emp=${emp.empno}">수정</a> / <a onclick="deleteByempno(${emp.empno});" style="cursor: pointer">삭제</a></td>

      </tr>

    </c:forEach>

  </table>

  <a href="/emp/register">사원 등록</a> <a href="/emp/list">사원 리스트</a>

  <div style="margin-top: 10px">

    <form>

      검색
      <select name="searchType">

        <option value="ename">사원이름</option>
        <option value="job">직책</option>
        <option value="mgr">관리번호</option>
        <option value="deptno">부서번호</option>

      </select>

      <input type="text" name="keyword">
      <input type="submit" value="검색">

    </form>

  </div>

  <script>

    function  deleteByempno(emp) {

      if(confirm("삭제하시겠습니까?")) {
        location.href = '/emp/delete?empno='+emp;
      }
    }

  </script>


</body>
</html>
