<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-24
  Time: 오후 4:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

  <h1>사원등록 등록</h1>
  <hr>

  <form method="post">

    <table>

      <tr>

        <td>사원번호</td>
        <td><input type="number" name="empno"></td>

      </tr>

      <tr>

        <td>사원이름</td>
        <td><input type="text" name="ename"></td>

      </tr>

      <tr>

        <td>직책</td>
        <td><input type="text" name="job"></td>

      </tr>

      <tr>

        <td>관리번호</td>
        <td><input type="number" name="mgr"></td>

      </tr>

      <tr>

        <td>입사일</td>
        <td><input type="date" name="hiredate"></td>

      </tr>

      <tr>

        <td>연봉</td>
        <td><input type="number" name="sal"></td>

      </tr>

      <tr>

        <td>보너스</td>
        <td><input type="number" name="comm"></td>

      </tr>

      <tr>

        <td>부서번호</td>
        <td><input type="number" name="deptno"></td>

      </tr>

      <tr>

        <td></td>
        <td><input type="submit" value="등록"></td>

      </tr>

    </table>

  </form>

</body>
</html>
