<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2018/12/5
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>大类添加</title>
    <!--告诉浏览器禁止缩放-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <!--css样式-->
    <link href="bower_components/bootswatch/dist/sketchy/bootstrap.css" rel="stylesheet" type="text/css">
</head>
<body>
<!--响应式设计-->
  <div class="container-fluid">
     <div class="row">
         <div class="col-md-12">
             <div class="card">
                 <div class="card-body">
                     <form method="post" autocomplete="off" action="bigTypeAdd">
                           <div class="form-group row">
                          <!--label for 作用是当点击它内部文字，该内容获取焦点-->
                          <label for="inputName" class="col-sm-2 col-form-label text-right">大类名</label>
                          <div class="col-sm-10">
                              <input type="text" class="form-control" id="inputName" placeholder="大类名" name="name">
                          </div>
                 </div>

                         <div class="form-group row">
                             <div class="col-sm-2"></div>
                              <div class="col-sm-10">
                                  <button type="submit" class="btn btn-primary">添加</button>
                             </div>
                         </div>

                      </form>
                 </div>
             </div>
         </div>
     </div>
  </div>
<script type="text/javascript" src="bower_components/jquery/dist/jquery.js"></script>
<script type="text/javascript" src="bower_components/bootstrap/dist/js/bootstrap.js"></script>
</body>
</html>
