<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2018/12/6
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍列表</title>
    <%--告诉浏览器不要缩放--%>
    <meta name="viewport" content="width=device-width,initial-scale=1,shrink-to-fit=no">
    <%--css 样式--%>
    <link rel="stylesheet" type="text/css" id="themeLink">
    <%--通常情况下JavaScript放在body标签之前，但这里避免二次绘制，提前--%>
    <script type="text/javascript" src="bower_components/jquery/dist/jquery.js"></script>
    <script type="text/javascript" src="bower_components/jquery.cookie/jquery.cookie.js"></script>
    <script type="text/javascript">
        <!--切记不要等到文档加载完毕，如果你等到文档加载完毕，将绘制两次  不要$(function(){})-->
        if ($.cookie("bootstrapTheme")) {//如果用户已经设置过主题，就用它设置的
            $("#themeLink").attr(
                "href",
                "bower_components/bootswatch/dist/"
                + $.cookie("bootstrapTheme") + "/bootstrap.css");
            $("#themeSel").val($.cookie("bootstrapTheme"));
        }else {//如果没有设置过就用默认
            $("#themeLink").attr("href","bower_components/bootswatch/dist/cerulean/bootstrap.css");
        }

    </script>
</head>
<body>
     <div class="container-fluid">
         <div class="row">
             <div class="col-md-12">
                 <nav class="navbar-expand-lg navbar-light bg-light">
                     <button class="navbar-toggler" type="button" data-toggle="collapse"
                        data-target="#bs-example-navbar-collapse-1">
                         <span class="navbar-toggler-icon"></span>
                     </button>
                     <a class="navbar-brand" href="#"><img src="img/dgjy.png" style="..."/>
                     </a>
                     <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1" >
                         <ul class="navbar-nav">
                             <li class="nav-item active"><a class="nav-link" href="#">Link<span
                               class="sr-only">(current)</span></a></li>
                             <li class="nav-item"><a class="nav-link" href="#">Link</a></li>
                           <li class="nav-ietm dropdown"><a class="nav-link dropdown-toggle" href="http://example.com"
                                id="navbarDropdownMenuLink" data-toggle="dropdown">Dropdown
                                   Link</a>
                                <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                                    <a class="dropdown-item" href="#">Action</a><a class="dropdown-item" href="#">Another
                                      action</a> <a class="dropdown-item" href="#">Something else
                                      here</a>
                                    <div class="dropdown-divider"></div>
                                    <a class="dropdown-item">Separated link</a>
                                </div>
                             </li>
                         </ul>
                         <!--form begain-->
                         <form class="form-inline">
                             <input class="form-control mr-sm-2" type="text"/>
                             <button class="btn btn-primary my-2 my-sm-0" type="submit">Search</button>
                         </form>

                         <!--form end-->
                         <ul class="navbar-nav ml-md-auto">
                             <li class="nav-item active"><a class="nav-link" href="javascript:vodi(0)">
                                 <select id="themeSel" class="custom-s"><%--未写全--%>
                                   <option>cerulean</option>
                                   <option>cosmo</option>
                                     <option>darkly</option>
                                     <option>flatly</option>
                                     <option>journal</option>
                                     <option>lumen</option>
                                     <option>paper</option>
                                     <option>readable</option>
                                     <option>sandstone</option>
                                     <option>simplex</option>
                                     <option>slate</option>
                                     <option>spacelab</option>
                                     <option>superhero</option>
                                     <option>united</option>
                                     <option>yeti</option>
                                 </select>
                             </a></li
                                 <%--88行 七分钟04s--%>
                             <li class="nav-item dropdown"><a class="nav-link dropdown-toggle" href="http://example.com"
                                     id="navbarDropdownMenuLink" data-toggle="dropdown">Dropdown link
                             </a>
                             <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
                                 <a class="dropdown-item" href="#"></a><a class="dropdown-item">Another
                                   action</a><a class="dropdown-item" href="#">Something else
                                   here</a>
                                 <div class="dropdown-divider"></div>
                                 <a class="dropdown-item">Separated link</a>
                             </div>
                             </li>
                         </ul>
                     </div>
                 </nav>
             </div>
         </div>
     </div>
      <%--from bg--%>
</body>
</html>
