package com.oraclepwd.ddbookmarket.web;

import com.oraclepwd.ddbookmarket.biz.BigTypeBiz;
import com.oraclepwd.ddbookmarket.biz.impl.BigTypeBizImpl;
import com.oraclepwd.ddbookmarket.model.BigType;
import org.json.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "FindAllBigTypeServlet",value = "/findAllBigType")
public class FindAllBigTypeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          //1

          //2
        BigTypeBiz bigTypeBiz =new BigTypeBizImpl();
        List<BigType> ls=bigTypeBiz.findAllBigType();
          //3 js
          // 告诉客户端发送的是js
          response.setContentType("text/javascript;charset=UTF-8");
          PrintWriter out = response.getWriter();
          JSONArray  jsonArray = new JSONArray(ls);
          out.println("fillSel("+jsonArray.toString()+")");
          out.flush();
    }
}
