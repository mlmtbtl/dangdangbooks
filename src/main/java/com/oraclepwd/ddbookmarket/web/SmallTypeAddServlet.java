package com.oraclepwd.ddbookmarket.web;

import com.oraclepwd.ddbookmarket.biz.SmallTypeBiz;
import com.oraclepwd.ddbookmarket.biz.impl.SmallTypeBizImpl;
import com.oraclepwd.ddbookmarket.model.SmallType;
import com.oraclepwd.ddbookmarket.util.MyBeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SmallTypeAddServlet" ,value = ("/smallTypeAdd"))
public class SmallTypeAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //
        SmallType smallType =new SmallType();
        MyBeanUtils.populate(smallType,request.getParameterMap());
        //2
        SmallTypeBiz smallTypeBiz = new SmallTypeBizImpl();
        boolean ret =smallTypeBiz.save(smallType);
        //3
        if (ret){
            response.sendRedirect("main.jsp");
        }else {
            request.setAttribute("smallType",smallType);
            //回填回去
            request.getRequestDispatcher("/smallTypeAdd").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
