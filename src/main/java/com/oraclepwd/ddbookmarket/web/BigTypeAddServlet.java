package com.oraclepwd.ddbookmarket.web;

import com.oraclepwd.ddbookmarket.biz.BigTypeBiz;
import com.oraclepwd.ddbookmarket.biz.impl.BigTypeBizImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "BigTypeAddServlet" ,value="/bigTypeAdd")
public class BigTypeAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     // 把用户填写的大类名存储到数据库
        String name = request.getParameter("name");
        //
        BigTypeBiz bigTypeBiz = new BigTypeBizImpl();
        boolean ret =bigTypeBiz.save(name);
        if (ret){
            response.sendRedirect("main.jsp");
        }else {
            request.setAttribute("name",name);
            request.getRequestDispatcher("/bigTypeAdd.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
