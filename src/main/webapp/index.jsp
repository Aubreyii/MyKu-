<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/8/7
  Time: 12:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>马嘉骏的小本本</title>
    <link rel="stylesheet" href="lib/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <script src="lib/2.2.4/jquery-1.12.4.min.js"></script>
    <script src="lib/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="page-header">
            <h1><span class="glyphicon glyphicon-heart"></span>
                马嘉骏的小本本           <small>            记录每件事</small></h1>
        </div>
    </div>
    <div class="row">
        <div class="jumbotron">
            <h1>记录点滴</h1>
            <p>当他回首往事的时候，他不会因为虚度年华而悔恨，也不会因为碌碌无为而羞耻</p>
            <p><a class="btn btn-primary btn-lg" href="${pageContext.request.contextPath}/addThing.jsp" role="button">留下点滴</a></p>
        </div>
    </div>
    <div class="row">
        <table class="table table-hover table-striped">
            <tr>
                <th>记录编号</th>
                <th>记录人物</th>
                <th>对象</th>
                <th>好坏</th>
                <th>记录时间</th>
                <th>代办时间</th>
                <th>地点</th>
                <th>内容</th>
                <th>状态</th>
                <th>操作</th>
            </tr>
            <c:forEach var="thing" items="${thingList}">
                <tr>
                    <td>${thing.id}</td>
                    <td>${thing.wo}</td>
                    <td>${thing.others}</td>
                    <td>${thing.gob}</td>
                    <td>${thing.rtime}</td>
                    <td>${thing.dotime}</td>
                    <td>${thing.place}</td>
                    <td>${thing.content}</td>
                    <c:if test="${thing.ach == 0}">
                        <td>尚未完成</td>
                    </c:if>
                    <c:if test="${thing.ach==1}">
                        <td>已完成</td>
                    </c:if>
                    <c:if test="${thing.ach==2}">
                        <td>未完成</td>
                    </c:if>
                    <td>
                        <a href="${pageContext.request.contextPath}/detail?id=${thing.id}">查看</a>
                        <c:if test="${thing.ach==0}">
                            <a href="${pageContext.request.contextPath}/delthing?id=${thing.id}&type=lock">完成</a>
                        </c:if>
                        <a href="${pageContext.request.contextPath}/delthing?id=${thing.id}&type=guoqi">过期</a>
                        <a href="${pageContext.request.contextPath}/delthing?id=${thing.id}&type=del">删除</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
