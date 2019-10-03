<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/8/14
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
            <p><a class="btn btn-primary btn-lg" href="index" role="button">回到主页</a></p>
        </div>
    </div>
    <div class="row">
        <div class="col-md-8 col col-md-offset-2">
            <form class="form-horizontal" action="${pageContext.request.contextPath}/addThing">
                <div class="form-group">
                    <label for="me" class="col-sm-2 control-label">记录人物</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="me"  name="me" placeholder="请输入记录人物">
                    </div>
                </div>
                <div class="form-group">
                    <label for="others" class="col-sm-2 control-label">相关对象</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="others"  name="others" placeholder="请输入相关对象">
                    </div>
                </div>
                <div class="form-group">
                    <label for="gob" class="col-sm-2 control-label">事情好坏</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="gob"  name="gob" placeholder="请输入事情好坏">
                    </div>
                </div>

                <div class="form-group">
                    <label for="dotime" class="col-sm-2 control-label">代办时间</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="dotime" name="dotime" placeholder="请输入代办时间">
                    </div>
                </div>
                <div class="form-group">
                    <label for="place" class="col-sm-2 control-label">发生地点</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="place" name="place" placeholder="请输入事情发生地点">
                    </div>
                </div>
                <div class="form-group">
                    <label for="content" class="col-sm-2 control-label">详细内容</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="content" name="content" placeholder="请输入事情详细内容">
                    </div>
                </div>
                <div class="form-group">
                    <input type="submit" value="提交数据更新" class="btn btn-primary">
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
