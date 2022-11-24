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

  <h1>사원정보 수정</h1>
  <hr>

  <form method="post">

    <table>

      <tr>

        <td>사원번호</td>
        <td><input type="number" name="empno" value="${emp.empno}"></td>

      </tr>

      <tr>

        <td>사원이름</td>
        <td><input type="text" name="ename" value="${emp.ename}"></td>

      </tr>

      <tr>

        <td>직책</td>
        <td>

          <select name="job">

            <option value="CLERK">CLERK</option>
            <option value="SALESMAN">SALESMAN</option>
            <option value="MANAGER">MANAGER</option>
            <option value="ANALYST">ANALYST</option>

          </select>

        </td>

      </tr>

      <tr>

        <td>관리번호</td>
        <td>

          <select name="mgr">

            <option value="7566">7566</option>
            <option value="7698">7698</option>
            <option value="7782">7782</option>
            <option value="7788">7788</option>
            <option value="7902">7902</option>

          </select>

        </td>

      </tr>

      <tr>

        <td>입사일</td>
        <td><input type="date" name="hiredate" value="${emp.hiredate}"></td>

      </tr>

      <tr>

        <td>연봉</td>
        <td><input type="number" name="sal" value="${emp.sal}"></td>

      </tr>

      <tr>

        <td>보너스</td>
        <td><input type="number" name="comm" value="${emp.comm}"></td>

      </tr>

      <tr>

        <td>부서번호</td>
        <td>

          <select name="deptno">

            <option value="10">10</option>
            <option value="20">20</option>
            <option value="30">30</option>

          </select>

        </td>

      </tr>

      <tr>

        <td></td>
        <td><input type="submit" value="수정완료"></td>

      </tr>

    </table>

  </form>

</body>
</html>
