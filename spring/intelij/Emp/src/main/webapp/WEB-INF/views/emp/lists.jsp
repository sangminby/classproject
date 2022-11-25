<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-24
  Time: 오후 12:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

    <title>Title</title>

    <!-- Bootstrap core CSS -->
    <link href="/css/bootstrap/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/css/bootstrap/offcanvas.css" rel="stylesheet">

</head>

<body class="bg-light">

    <nav class="navbar navbar-expand-lg fixed-top navbar-dark bg-dark">

        <a class="navbar-brand mr-auto mr-lg-0" href="#">EMP MANAGER</a>

        <button class="navbar-toggler p-0 border-0" type="button" data-toggle="offcanvas">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="navbar-collapse offcanvas-collapse" id="navbarsExampleDefault">

            <ul class="navbar-nav mr-auto">

                <li class="nav-item active">
                    <a class="nav-link" href="#">EMP <span class="sr-only">(current)</span></a>
                </li>

                <li class="nav-item active">
                    <a class="nav-link" href="#">Notifications</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="#">Profile</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="#">Switch account</a>
                </li>

                <li class="nav-item dropdown">

                    <a class="nav-link dropdown-toggle" href="https://example.com" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Settings</a>

                    <div class="dropdown-menu" aria-labelledby="dropdown01">

                        <a class="dropdown-item" href="#">Action</a>
                        <a class="dropdown-item" href="#">Another action</a>
                        <a class="dropdown-item" href="#">Something else here</a>

                    </div>

                </li>

            </ul>

            <form class="form-inline my-2 my-lg-0">

                <select name="searchType">

                    <option value="ename">사원이름</option>
                    <option value="job">직책</option>
                    <option value="mgr">관리번호</option>
                    <option value="deptno">부서번호</option>

                </select>

                <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search" name="keyword">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>

            </form>

        </div>

    </nav>


    <div class="nav-scroller bg-white box-shadow">

        <nav class="nav nav-underline">

            <a class="nav-link active" href="#">Dashboard</a>
            <a class="nav-link" href="#"> Friends <span class="badge badge-pill bg-light align-text-bottom">27</span></a>
            <a class="nav-link" href="#">Explore</a>
            <a class="nav-link" href="#">Suggestions</a><%--
            <a class="nav-link" href="#">Link</a>
            <a class="nav-link" href="#">Link</a>
            <a class="nav-link" href="#">Link</a>
            <a class="nav-link" href="#">Link</a>
            <a class="nav-link" href="#">Link</a>--%>

        </nav>

    </div>

    <main role="main" class="container">

        <div class="d-flex align-items-center p-3 my-3 text-white-50 bg-primary rounded box-shadow">

            <img class="mr-3" src="https://icons.getbootstrap.com/assets/img/icons-hero.png" alt="" width="48" height="48">

            <div class="lh-100">

                <h6 class="mb-0 text-white lh-100">사원 리스트</h6>
                <small>사원의 정보를 출력합니다.</small>

            </div>

        </div>

        <div class="my-3 p-3 bg-white rounded box-shadow">

            <h6 class="border-bottom border-gray pb-2 mb-0">사원 리스트</h6>

            <div class="m-3 p-1 border" >

                <form>

                    <table>

                        <tr>
                            <td class="p-2">검색</td>
                            <td class="p-2">

                                <select class="form-control"  name="searchType">
                                    <option value="ename">사원이름</option>
                                    <option value="job">직책</option>
                                    <option value="mgr">관리번호</option>
                                    <option value="deptno">부서번호</option>
                                </select>

                            </td>

                            <td class="p-2">
                                <input type="text" class="form-control" name="keyword">
                            </td>

                            <td class="p-2">
                                <input type="submit" class="btn btn-info" value="검색">
                            </td>

                        </tr>

                    </table>

                </form>

            </div>


            <table class="table table-striped table-bordered text-center">

                <thead class="thead-dark">

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

                </thead>

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

            <small class="d-block text-right mt-3">
                <a class="btn btn-success" href="/emp/register">사원 등록</a> <a class="btn btn-success" href="/emp/list">사원 리스트</a>
            </small>

        </div>

    </main>


    <script>

        function  deleteByempno(emp) {

            if(confirm("삭제하시겠습니까?")) {
                location.href = '/emp/delete?empno='+emp;
            }
        }

    </script>


    <!-- Bootstrap core JavaScript
       ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="js/assets/vendor/jquery-slim.min.js"><\/script>')</script>
    <script src="js/assets/vendor/popper.min.js"></script>
    <script src="js/bootstrap/bootstrap.min.js"></script>
    <script src="js/assets/js/vendor/holder.min.js"></script>
    <script src="js/bootstrap/offcanvas.js"></script>

</body>
</html>
