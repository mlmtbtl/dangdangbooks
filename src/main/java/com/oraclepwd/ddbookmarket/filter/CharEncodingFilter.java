package com.oraclepwd.ddbookmarket.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


@WebFilter("/*")
public class CharEncodingFilter implements Filter{
    public  CharEncodingFilter(){

    }
    public void destroy(){

    }
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)throws IOException,ServletException{
         request.setCharacterEncoding("UTF-8");
         chain.doFilter(request,response);
    }
    public  void  init(FilterConfig fConfig)throws ServletException{

    }
}
